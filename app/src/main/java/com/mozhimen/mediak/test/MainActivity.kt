package com.mozhimen.mediak.test

import android.view.View
import com.mozhimen.kotlin.utilk.android.content.startContext
import com.mozhimen.mediak.test.databinding.ActivityMainBinding
import com.mozhimen.mvvmk.bases.activity.viewbinding.BaseActivityVB

class MainActivity : BaseActivityVB<ActivityMainBinding>() {

    fun goMediaK(view: View) {
        startContext<MediaKActivity>()
    }
}