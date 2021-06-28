/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping.view.fragment

import com.thread0.bookkeeping.R

/**
 * 资产界面
 *
 *      TODO:资产分类
 *          1、现金账户
 *              1.1、现金
 *              1.2、微信
 *              1.3、支付宝
 *          2、金融账户
 *              2.1、银行卡
 *              2.2、存折
 *          3、信用账户
 *              3.1、信用卡
 *              3.2、蚂蚁花呗
 *              3.3、蚂蚁借呗
 *              3.4、网商贷
 *              3.5、京东白条
 *          4、债权账户
 *              4.1、报销
 *              4.2、借出
 *              4.3、押金
 *          5、虚拟账户
 *              5.1、饭卡
 *              5.2、公交卡
 *              5.3、购物卡
 *              5.4、礼券
 *          6、投资账户
 *              6.1、股票
 *              6.2、基金
 *              6.3、黄金
 *
 * TODO:1、本界面需显示资产列表，同种资产分类的放置与一块，不同资产分类间需有间隔做区分，列表顶部显示净资产
 *      2、资产列表需要可以由用户添加，所以此界面需要一个AddAssetsActivity的入口
 *      3、点击列表的item根据当前item的资产分类，进入不同的界面
 *          现金账户、债券账户、虚拟账户、投资账户，进入AddAssetsDetailsActivity界面
 *          金融账户，进入AddFinancialAssetsActivity界面
 *          信用账户，信用卡进入AddCreditCardActivity界面、其他信用账户进入AddCreditActivity界面，此分类下仅支持添加负债
 *      4、列表需要一个按钮来控制各项资产的显示与隐藏（当净资产隐藏时，才显示各项资产的显示与隐藏按钮）
 *      5、此界面当资产列表为空时，需添加默认资产列表
 *          现金、支付宝、微信、银行卡、蚂蚁花呗、信用卡、押金
 *      6、当数据库内的数据发生变化时，需及时更新此界面
 *      6、需统合当前界面以及AddAssetsActivity、AddAssetsDetailsActivity、AddFinancialAssetsActivity、AddCreditCardActivity、AddCreditActivity界面提示的需求来设计数据库表
 *      tips：res文件夹内有一些icon可以使用，也可自行添加其他icon，最后项目完成时记得删除所有没用到的图片
 */
class AssetsFragment : BaseFragment() {

    override fun getLayoutId() = R.layout.fragment_assets

    override fun initData() {

    }
}