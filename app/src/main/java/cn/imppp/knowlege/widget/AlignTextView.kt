package cn.imppp.knowlege.widget

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.text.Layout
import android.text.StaticLayout
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatTextView
import cn.imppp.knowlege.R

class AlignTextView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {
    private var alignOnlyOneLine = false

    init {
        val typedArray: TypedArray =
                context.obtainStyledAttributes(attrs, R.styleable.AlignTextView)
        alignOnlyOneLine = typedArray.getBoolean(R.styleable.AlignTextView_alignOnlyOneLine, false)
        typedArray.recycle()
    }

    override fun onDraw(canvas: Canvas?) {
        when (val content: CharSequence = text) {
            is String -> handleString(content, canvas)
            //不是String类型按原来的执行就完了
            else -> super.onDraw(canvas)
        }

    }

    private fun handleString(text: String, canvas: Canvas?) {
        val layout: Layout = layout
        for (i in 0 until layout.lineCount ) {
            val lineBaseLine = layout.getLineBaseline(i).toFloat() + paddingTop
            val lineStart = layout.getLineStart(i)
            val lineEnd = layout.getLineEnd(i)
            if (alignOnlyOneLine && layout.lineCount == 1) {//只有一行,并且采用了对齐方式
//                val line = text.substring(lineStart, lineEnd)
//                val width = StaticLayout.getDesiredWidth(text, lineStart, lineEnd, paint)
//                drawScaledText(canvas, line, lineBaseLine, width)
                Log.i("onlyOne", "success")
                canvas?.drawText(
                        text.substring(lineStart),
                        paddingLeft.toFloat(),
                        lineBaseLine,
                        paint
                )
            } else if (i == layout.lineCount - 1) {//最后一行
                canvas?.drawText(
                        text.substring(lineStart),
                        paddingLeft.toFloat(),
                        lineBaseLine,
                        paint
                )
            } else {//中间行
                val line = text.substring(lineStart, lineEnd)
                val width = StaticLayout.getDesiredWidth(text, lineStart, lineEnd, paint)
                drawScaledText(canvas, line, lineBaseLine, width)
            }
        }
    }
    /*
    * 绘制当前行对齐
    */
    private fun drawScaledText(canvas: Canvas?, line: String, lineBaseLine: Float, width: Float) {
        if (line.isEmpty())
            return
        var x = paddingLeft.toFloat()
        //判断最后一个字符是不是换行符
        val forceNextLine = line.toCharArray()[line.length - 1].toInt() == 10
        //下一行要换行
        if (forceNextLine || line.length - 1 == 0) {
            canvas?.drawText(line, x, lineBaseLine, paint)
            return
        }
        //计算出每个字符之间的间隔
        val d = (measuredWidth - width - paddingLeft - paddingRight) / (line.length - 1)

        for (element in line) {
            val c = element.toString()
            val vw = StaticLayout.getDesiredWidth(c, paint)
            canvas?.drawText(c, x, lineBaseLine, paint)
            x += vw + d  //下个字符的x坐标
        }
    }

}