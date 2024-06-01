package com.example.jokeapp

import retrofit2.Call
import retrofit2.http.GET

interface JokeService {
    @GET("/comments")
    fun getComments(): Call<List<Joke>>
}