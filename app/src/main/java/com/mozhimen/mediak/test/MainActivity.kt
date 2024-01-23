package com.mozhimen.mediak.test

import android.view.View
import com.mozhimen.basick.elemk.androidx.appcompat.bases.databinding.BaseActivityVB
import com.mozhimen.basick.utilk.android.content.startContext
import com.mozhimen.mediak.test.databinding.ActivityMainBinding

class MainActivity : BaseActivityVB<ActivityMainBinding>() {

    fun goMediaK(view: View) {
        startContext<MediaKActivity>()
    }
}