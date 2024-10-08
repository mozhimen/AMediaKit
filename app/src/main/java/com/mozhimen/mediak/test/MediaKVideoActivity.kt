package com.mozhimen.mediak.test

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.mozhimen.kotlin.utilk.kotlin.UtilKStrAsset
import com.mozhimen.kotlin.utilk.kotlin.UtilKStrPath
import com.mozhimen.mediak.test.databinding.ActivityMediakVideoBinding
import com.mozhimen.bindk.bases.viewbinding.activity.BaseActivityVB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MediaKVideoActivity : BaseActivityVB<ActivityMediakVideoBinding>() {

    private val _path by lazy { UtilKStrPath.Absolute.Internal.getFiles() + "/videoPath/" }
    private var _currentUrl: String? = null
        get() {
            return when (field) {
                null -> _path + "layoutk_video.mp4"
                _path + "layoutk_video.mp4" -> _path + "layoutk_video2.mp4"
                else -> _path + "layoutk_video.mp4"
            }.also { field = it }
        }

    override fun initView(savedInstanceState: Bundle?) {
        lifecycleScope.launch(Dispatchers.IO) {
            UtilKStrAsset.strAssetName2file("layoutk_video.mp4", _path + "layoutk_video.mp4")
            UtilKStrAsset.strAssetName2file("layoutk_video2.mp4", _path + "layoutk_video2.mp4")
            withContext(Dispatchers.Main) {
                vb.layoutkVideo2.initVideo(_currentUrl!!)
            }
        }
        vb.btnChangeVideo.setOnClickListener {
            vb.layoutkVideo2.changeVideo(_currentUrl!!)
        }
    }
}