/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.fragment

import com.thread0.bookkeeping.R


/**
 * 图标界面
 * TODO：1、展示用户本周/本月的：
 *          1.1、总支出
 *          1.2、每日平均支出
 *          1.3、同上周/上月比较，示例："较上周总支出上涨/下降800.00元，日均上涨/下降114.29元"，上涨时金额显示红色，下降时金额显示绿色
 *          1.4、当周/当月每日消费组成折线图进行展示
 *          1.5、当周/当月的消费类别组成饼图展示（需提前确定消费所属类别）
 *       2、需要提供切换周/月视图的按钮
 */
class ChartFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_chart
    }

    override fun initData() {

    }
}