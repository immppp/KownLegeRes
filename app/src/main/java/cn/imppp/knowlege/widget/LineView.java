package cn.imppp.knowlege.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.qmuiteam.qmui.util.QMUIDisplayHelper;

import androidx.annotation.Nullable;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.app.App;

/**
 * 绘制线条view
 */

public class LineView extends View {

    private Paint paint;
    private int lineCount;

    public LineView(Context context) {
        super(context);
    }

    public LineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.LineView);
        lineCount = typedArray.getColor(R.styleable.LineView_lineCount, 2);
    }

    public LineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        paint = new Paint();
        paint.setAntiAlias(true);//抗锯齿功能
        paint.setColor(Color.WHITE);  //设置画笔颜色
        paint.setStyle(Paint.Style.FILL);//设置填充样式
        paint.setStrokeWidth(10);//设置画笔宽度 ，单位px
    }

    public void setLineCount(int tag) {
        lineCount = tag;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (lineCount) {
            case 2:
                RectF oval3 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 4), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 6));// 设置个新的长方形
                canvas.drawRoundRect(oval3, 5, 5, paint);
                oval3 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 12), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 14));// 设置个新的长方形
                canvas.drawRoundRect(oval3, 5, 5, paint);
                break;
            case 3:
                RectF oval4 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 2), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 4));// 设置个新的长方形
                canvas.drawRoundRect(oval4, 5, 5, paint);
                oval4 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 8), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 10));// 设置个新的长方形
                canvas.drawRoundRect(oval4, 5, 5, paint);
                oval4 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 14), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 16));// 设置个新的长方形
                canvas.drawRoundRect(oval4, 5, 5, paint);
                break;
            case 4:
                RectF oval5 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 2), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 4));// 设置个新的长方形
                canvas.drawRoundRect(oval5, 5, 5, paint);
                oval5 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 6), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 8));// 设置个新的长方形
                canvas.drawRoundRect(oval5, 5, 5, paint);
                oval5 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 10), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 12));// 设置个新的长方形
                canvas.drawRoundRect(oval5, 5, 5, paint);
                oval5 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 14), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 16));// 设置个新的长方形
                canvas.drawRoundRect(oval5, 5, 5, paint);
                break;
            case 5:
                RectF oval6 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 2), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 4));// 设置个新的长方形
                canvas.drawRoundRect(oval6, 5, 5, paint);
                oval6 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 5), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 7));// 设置个新的长方形
                canvas.drawRoundRect(oval6, 5, 5, paint);
                oval6 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 8), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 10));// 设置个新的长方形
                canvas.drawRoundRect(oval6, 5, 5, paint);
                oval6 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 11), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 13));// 设置个新的长方形
                canvas.drawRoundRect(oval6, 5, 5, paint);
                oval6 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 14), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 16));// 设置个新的长方形
                canvas.drawRoundRect(oval6, 5, 5, paint);
                break;
            case 6:
                RectF oval7 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 0), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 2));// 设置个新的长方形
                canvas.drawRoundRect(oval7, 5, 5, paint);
                oval7 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 3), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 5));// 设置个新的长方形
                canvas.drawRoundRect(oval7, 5, 5, paint);
                oval7 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 6), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 8));// 设置个新的长方形
                canvas.drawRoundRect(oval7, 5, 5, paint);
                oval7 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 9), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 11));// 设置个新的长方形
                canvas.drawRoundRect(oval7, 5, 5, paint);
                oval7 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 12), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 14));// 设置个新的长方形
                canvas.drawRoundRect(oval7, 5, 5, paint);
                oval7 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 15), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 17));// 设置个新的长方形
                canvas.drawRoundRect(oval7, 5, 5, paint);
                break;
            case 7:
                RectF oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 2), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 3));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 4), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 5));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 6), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 7));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 8), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 9));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 10), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 11));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 12), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 13));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                oval8 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 14), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 15));// 设置个新的长方形
                canvas.drawRoundRect(oval8, 5, 5, paint);
                break;
            default:
                RectF oval9 = new RectF(0, QMUIDisplayHelper.dp2px(App.getContext(), 0), QMUIDisplayHelper.dp2px(App.getContext(), 17), QMUIDisplayHelper.dp2px(App.getContext(), 17));// 设置个新的长方形
                canvas.drawRoundRect(oval9, 5, 5, paint);
                break;
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSize = appMeasure(widthMeasureSpec);
        int heightSize = appMeasure(heightMeasureSpec);
        setMeasuredDimension(widthSize, heightSize);
    }

    private int appMeasure(int whMeasureSpec) {
        int whMode = MeasureSpec.getMode(whMeasureSpec);
        int whSize = MeasureSpec.getSize(whMeasureSpec);
        int valueSize = 0;
        if (whMode == MeasureSpec.EXACTLY) {
            valueSize = whSize;
        } else {
            if (whMode == MeasureSpec.AT_MOST) {
                valueSize = Math.min(valueSize, whSize);
            }
        }
        return valueSize;
    }
}
