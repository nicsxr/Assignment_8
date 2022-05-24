package com.example.assignment_8

import java.io.Serializable

data class DataX(
    val avatar: String,
    val email: String,
    val first_name: String,
    val id: Int,
    val last_name: String
) : Serializable