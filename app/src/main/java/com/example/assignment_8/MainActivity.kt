package com.example.assignment_8

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    val baseUrl = "https://reqres.in/api/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener{
            getResources(this)
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            getUsersData(this)
        }
    }

    private fun getUsersData(context: Context) {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
            .create(ApiInterface::class.java)

        val data = retrofitBuilder.getUsers()

        data.enqueue(object : Callback<UsersList?>{
            override fun onResponse(
                call: Call<UsersList?>,
                response: Response<UsersList?>
            ) {
                val body = response.body()!!
                intent = Intent(context, MainActivity3::class.java)

                intent.putExtra("data", body.data as Serializable)
                context.startActivity(intent)
            }

            override fun onFailure(call: Call<UsersList?>, t: Throwable) {
                println(t)
                println("------------------------------------------")
            }
        })
    }

    private fun getResources(context: Context){
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
            .create(ApiInterface::class.java)

        val data = retrofitBuilder.getResources()

        data.enqueue(object : Callback<ResorucesList?>{
            override fun onResponse(
                call: Call<ResorucesList?>,
                response: Response<ResorucesList?>
            ) {
                val body = response.body()!!
                intent = Intent(context, MainActivity2::class.java)

                intent.putExtra("data", body.data as Serializable)
                context.startActivity(intent)
            }

            override fun onFailure(call: Call<ResorucesList?>, t: Throwable) {
                println(t)
                println("------------------------------------------")
            }
        })
    }
}