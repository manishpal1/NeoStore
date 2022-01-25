package com.example.neostorefinal.modelsClass

data class LoginErrorResponse(
    val message: String,
    val status: Int,
    val user_msg: String
)