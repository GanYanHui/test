/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity


import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity


/**
 * TODO：1、顶部title显示自定义
 *       2、编辑名称（保存后是账户名称）
 *       3、编辑金额，仅能填写数字和小数点
 *       4、编辑备注
 *       5、点击保存才存编辑内容进数据库，需提示是否保存成功
 */
class AddSelfDefinedAccountActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_assets_user_defined)

    }
}
