package com.example.assignment_8

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("unknown")
    fun getResources() : Call<ResorucesList>

    @GET("users?page=2")
    fun getUsers() : Call<UsersList>
}