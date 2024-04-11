package com.mozhimen.mediak.audio.mos


/**
 * @ClassName MAudioK
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Version 1.0
 */
data class MAudioKInfo(
    val name: String,//名字
    val url: String,//地址/url
    val type: Int,
    val id: String = url.hashCode().toString()
)