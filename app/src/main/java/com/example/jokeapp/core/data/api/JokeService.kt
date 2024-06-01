package com.example.jokeapp.core.data.api

import com.example.jokeapp.core.data.model.Joke
import retrofit2.Call
import retrofit2.http.GET

interface JokeService {
    @GET("/comments")
    fun getComments(): Call<List<Joke>>
}