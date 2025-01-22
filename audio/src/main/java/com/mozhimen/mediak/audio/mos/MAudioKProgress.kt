package com.mozhimen.mediak.audio.mos

import com.mozhimen.mediak.player.status.cons.EMediaKPlayerStatus

data class MAudioKProgress(
    val status: EMediaKPlayerStatus,
    val currentPos: Int,
    val duration: Int,
    val audioInfo: MAudioKInfo?
)