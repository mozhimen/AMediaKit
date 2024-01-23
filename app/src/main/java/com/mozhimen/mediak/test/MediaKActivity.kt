package com.mozhimen.mediak.test

import android.view.View
import com.mozhimen.basick.elemk.androidx.appcompat.bases.databinding.BaseActivityVB
import com.mozhimen.basick.utilk.android.content.startContext
import com.mozhimen.mediak.test.databinding.ActivityMediakBinding

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