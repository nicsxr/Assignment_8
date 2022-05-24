package com.example.assignment_8

data class UsersList(
    val `data`: List<DataX>,
    val page: Int,
    val per_page: Int,
    val support: SupportX,
    val total: Int,
    val total_pages: Int
)