/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity

import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity

/**
 * TODO：1、此界面需要可以编辑余额和备注外还需要选择所属银行（可以通过dialog或进入新界面进行选择，string文件内有常见银行列表）
 *       2、根据传入的数据分为编辑还是新增,并显示当前资产账户名称
 *       3、金额需要设置仅能填写数字和小数点
 *       4、点击保存才存编辑内容进数据库，需提示是否保存成功
 */
class AddFinancialAssetsActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financial_assets)

    }
}