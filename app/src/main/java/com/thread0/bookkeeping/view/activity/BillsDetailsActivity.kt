/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity

import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity

/**
 * 账单列表界面
 * TODO：1、账单列表通过时间顺序展示
 *       2、不同日期的账单通过在列表中添加显示日期的item进行区分以及归类，
 *          该日期item还需要显示该日期收入-支出后的结果，正数则显示"收入：xxx元"，负数则显示"支出：xxx元"
 *       3、当有本月数据时，列表顶部还需显示当月结余的金额，正负数均可
 */
class BillsDetailsActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bills_details)

    }

}