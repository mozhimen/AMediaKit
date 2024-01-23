package com.mozhimen.mediak.player.status.commons

import com.mozhimen.mediak.player.status.cons.EMediaKPlayerStatus

/**
 * @ClassName IMediaKStatusPLayer
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/5/29 15:38
 * @Version 1.0
 */
interface IMediaKStatusPLayer {
    /**
     * 设置播放状态
     * @param status EPlayStatus
     */
    fun setPlayStatus(status: EMediaKPlayerStatus)

    /**
     * 获取播放状态
     * @return EPlayStatus
     */
    fun getPlayStatus(): EMediaKPlayerStatus

    /**
     * 是否播放结束
     * @return Boolean
     */
    fun isPlayComplete(): Boolean
}