package com.example.jokeapp

import retrofit2.Call

class JokeRepository {
    fun getComments(): Call<List<Joke>> {
        return RetrofitInstance.api.getComments()
    }
}