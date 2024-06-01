package com.example.jokeapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jokeapp.core.data.model.Joke
import com.example.jokeapp.core.data.repository.JokeRepository
import com.example.jokeapp.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response

class MainViewModel(private val repository: JokeRepository): ViewModel() {

    private val _posts = MutableLiveData<List<Joke>>()
    val posts: LiveData<List<Joke>> get() = _posts

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error


    fun getComments(binding: ActivityMainBinding, ind: Int) {

        repository.getComments().enqueue(object : retrofit2.Callback<List<Joke>> {
            override fun onResponse(
                call: Call<List<Joke>>,
                response: Response<List<Joke>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        val postCloud = it[ind - 1]
                        binding.nameTextView.text = postCloud.name
                        binding.emailTextView.text = postCloud.email
                        binding.bodyTextView.text = postCloud.body
                    }
                }
            }

            override fun onFailure(call: Call<List<Joke>>, t: Throwable) {
                binding.nameTextView.text = "onFailure: ${t.message}"
            }
        })
    }

}