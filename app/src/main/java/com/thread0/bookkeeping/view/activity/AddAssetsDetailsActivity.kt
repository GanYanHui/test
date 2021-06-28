/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity

import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity

/**
 * TODO:1、此界面仅需编辑余额和备注
 *      2、根据传入的数据分为编辑还是新增,并显示当前资产账户名称
 *      3、金额需要设置仅能填写数字和小数点
 *      4、点击保存按钮才存编辑内容进数据库，需提示是否保存成功
 */
class AddAssetsDetailsActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_assets_details)

    }

}
