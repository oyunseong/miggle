package com.miggle.miggle.model

data class DartResponse (
    val isSuccess: Boolean? = null,
    val code: Int? = null,
    val message: String? = null,
    val result: Result
)

data class Result(
    val plusmoney : String? = null
)