package cn.imppp.knowlege.listener;

/**
  *
  *  ==================================================
  *     贤芯科技
  *  ==================================================
  * @Package:        cn.lierda.mxpad.listener
  * @ClassName:      OnRecyclerViewClickListener
  * @Description:    条目点击反馈
  * @Author:         gaoQl
  * @CreateDate:     2020/5/19 15:10
  * @UpdateRemark:   2020/5/19 15:10
  * @Version:        1.0
 */

public interface OnRecyclerViewClickListener2<T> {

    /**
     * 点击事件
     * @param t 对象
     * @param position  位置
     * @param Action    动作
     */
    void onItemClick2(T t, int position, int Action);

}
