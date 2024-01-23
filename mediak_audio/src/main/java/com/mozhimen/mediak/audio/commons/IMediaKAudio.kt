package com.mozhimen.mediak.audio.commons

import com.mozhimen.mediak.audio.cons.EMediaKAudioPlayMode
import com.mozhimen.mediak.audio.mos.MAudioKInfo
import com.mozhimen.mediak.player.status.cons.EMediaKPlayerStatus

/**
 * @ClassName IAudioKListener
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/10/31 15:26
 * @Version 1.0
 */
internal interface IMediaKAudio {
    /**
     * 获取播放列表
     * @return List<MAudioK>
     */
    fun getPlayList(): List<MAudioKInfo>
    fun addAudiosToPlayList(audios: List<MAudioKInfo>)
    fun addAudioToPlayList(audio: MAudioKInfo)
    fun addAudioToPlayListTop(audioK: MAudioKInfo)
    fun clearPLayList()
    fun getPlayMode(): EMediaKAudioPlayMode
    fun setPlayMode(playMode: EMediaKAudioPlayMode)
    fun setPlayPositionCurrent(playIndex: Int)
    fun getPlayPositionCurrent(): Int?
    fun getPlayPositionNext(): Int
    fun getPlayPositionPrevious(): Int
    fun getAudioFromPlayList(index: Int): MAudioKInfo?

    //control
    fun play()
    fun playNext()
    fun playPrevious()
    fun pause()
    fun release()

    /////////////////////////////////////////////////////

    fun getVolumeCurrent(): Int
    fun getVolumeMax(): Int
    fun getVolumeMin(): Int
    fun getVolumeInterval(): Int
    fun setVolume(volume: Int)
    fun setVolumePercent(volumePercent: Float)

    /////////////////////////////////////////////////////

    fun getPlayStatus(): EMediaKPlayerStatus
}