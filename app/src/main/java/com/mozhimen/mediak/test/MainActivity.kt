package com.mozhimen.mediak.test

import android.view.View
import com.mozhimen.bindk.bases.viewbinding.activity.BaseActivityVB
import com.mozhimen.kotlin.utilk.android.content.startContext
import com.mozhimen.mediak.test.databinding.ActivityMainBinding

class MainActivity : BaseActivityVB<ActivityMainBinding>() {

    fun goMediaK(view: View) {
        startContext<MediaKActivity>()
    }
}