/*
 * @Copyright: 2020-2021 www.thread0.com Inc. All rights reserved.
 */
package com.thread0.bookkeeping

import android.os.Bundle
import top.xuqingquan.base.view.activity.SimpleActivity

/**
 * TODO:1、根据当前布局按顺序加载AccountBookFragment、AssetsFragment,ChartFragment
 *      2、左右滑动可切换fragment
 */
class MainActivity : SimpleActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}