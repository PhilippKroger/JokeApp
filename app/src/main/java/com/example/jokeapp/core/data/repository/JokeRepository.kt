package com.example.jokeapp.core.data.repository

import com.example.jokeapp.core.data.api.RetrofitInstance
import com.example.jokeapp.core.data.model.Joke
import retrofit2.Call

class JokeRepository {
    fun getComments(): Call<List<Joke>> {
        return RetrofitInstance.api.getComments()
    }
}