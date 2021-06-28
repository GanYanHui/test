/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.fragment

import android.annotation.SuppressLint
import com.thread0.bookkeeping.R

/**
 * 月支出总额、月收入总额以及账单数据体现界面
 * TODO:1、显示本月支出总额，本月收入总额
 *      2、提供两个按钮，点击统一进入AddBillsActivity界面新增支出、收入记录
 *      3、需要一个账单列表展示最近三条支出或收入记录，单条点击后进入AddBillsActivity编辑该记录
 *      4、列表处需有入口可以进入BillsDetailsActivity界面
 *      5、当支出总额、收入总额以及账单列表发生变化时，需要更新界面的显示
 *      6、数据库表需结合当前界面、ChartFragment界面、BillsDetailsActivity界面和AddBillsActivity界面，的需求进行设计
 */
class AccountBookFragment : BaseFragment() {
    override fun getLayoutId() = R.layout.fragment_account_book

    @SuppressLint("ClickableViewAccessibility")
    override fun initData() {

    }

}