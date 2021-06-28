/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity

import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity


/**
 * TODO：1、此界面需要可以编辑金额、备注和还款日期
 *       2、根据传入的数据分为编辑还是新增,并显示当前资产账户名称
 *       3、金额需要设置仅能填写数字、小数点和负号，金额必须为负数，保存时需提示用户
 *       4、点击保存才存编辑内容进数据库，需提示是否保存成功
 */
class AddCreditActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_credit_assets)

    }
}