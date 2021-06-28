/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity

import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity

/**
 * 添加账单界面
 * TODO：1、进入界面时，根据传递进来的数据判断是新建账单还是修改账单
 *      2、需要一个可以选择账单日期的控件，新建账单时默认显示当前日期，修改账单时显示账单日期
 *      3、需要一个输入金额的editText，显示只能输入"-"（符号），"."（小数点）和数字，保留小数点后两位
 *      4、需要提供支出、收入选项让用户选择输入的金额是属于支出还是收入，根据点击进来前点击的是记支出还是记收入来判断默认选择支出还是收入模式。
 *      5、需要一个输入备注的editText，让用户设置当前账单的备注
 *      6、需要一个list展示一些较常用的支出备注以及收入备注，选择记录收入模式和选择记录支出模式下，列表展示的选项不一致，点击列表可以直接将列表展示的文字设置到editText内
 *      7、提供一个保存按钮，点击保存后才将修改/新增保存进数据库
 *      tips：支出相关备注还需要提前记录所属类型，如早餐属于餐饮类消费，打的属于出行类消费，当用户自行输入时，用户点击保存前需让用户选择所属消费类型
 */
class AddBillsActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_add_bills)
    }

}
