/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.activity

import android.os.Bundle
import com.thread0.bookkeeping.R
import top.xuqingquan.base.view.activity.SimpleActivity


/**
 * TODO:1、展示AssetsFragment界面内的资产分类列表，以供用户选择添加的资产账户，一级列表（如：现金账户）需要展示，但是无点击效果，二级列表（如：支付宝）点击进入对应界面
 *          现金账户、债券账户、虚拟账户、投资账户，进入AddAssetsDetailsActivity界面
 *          金融账户，进入AddFinancialAssetsActivity界面
 *          信用账户，信用卡进入AddCreditCardActivity界面、其他信用账户进入AddCreditActivity界面，此分类下仅支持添加负债
 *      2、需要增加自定义按钮，进入AddSelfDefinedAccountActivity界面
 *      3、进入对应界面后，保存成功后返回AssetsFragment界面，保存失败则返回本界面。
 */
class AddAssetsActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_assets)

    }
}
