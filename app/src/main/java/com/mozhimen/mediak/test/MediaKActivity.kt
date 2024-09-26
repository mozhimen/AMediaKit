package com.mozhimen.mediak.test

import android.view.View
import com.mozhimen.kotlin.utilk.android.content.startContext
import com.mozhimen.mediak.test.databinding.ActivityMediakBinding
import com.mozhimen.mvvmk.bases.activity.viewbinding.BaseActivityVB

/**
 * @ClassName MediaKActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2024/1/21 16:23
 * @Version 1.0
 */
class MediaKActivity : BaseActivityVB<ActivityMediakBinding>() {
    fun goAudioK(view: View) {
        startContext<MediaKAudioActivity>()
    }

    fun goVideoK(view: View) {
        startContext<MediaKVideoActivity>()
    }
}