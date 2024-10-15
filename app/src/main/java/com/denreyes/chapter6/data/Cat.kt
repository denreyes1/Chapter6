package com.denreyes.chapter6.data

import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class Cat(
    @SerialName("_id")
    val id: String,
    @SerialName("tags")
    val tags: List<String>,

//    @SerialName("owner")
//    val owner: String,
//    @SerialName("createdAt")
//    val createdAt: String,
//    @SerialName("updatedAt")
//    val updatedAt: String,

    @SerialName("mimetype")
    val mimeType: String,
    @SerialName("size")
    val size: Int,
)