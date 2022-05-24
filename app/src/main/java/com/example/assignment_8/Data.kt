package com.example.assignment_8

import java.io.Serializable

data class Data(
    val color: String,
    val id: Int,
    val name: String,
    val pantone_value: String,
    val year: Int
) : Serializable