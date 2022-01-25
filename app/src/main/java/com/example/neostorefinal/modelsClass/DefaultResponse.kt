package com.example.neostorefinal.modelsClass

data class DefaultResponse(
    val `data`: Data,
    val message: String,
    val status: Int,
    val user_msg: String
)