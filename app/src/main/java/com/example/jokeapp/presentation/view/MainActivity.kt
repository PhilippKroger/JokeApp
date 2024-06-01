package com.example.jokeapp.presentation.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.jokeapp.core.data.repository.JokeRepository
import com.example.jokeapp.presentation.viewmodel.MainViewModel
import com.example.jokeapp.presentation.viewmodel.MainViewModelFactory
import com.example.jokeapp.R
import com.example.jokeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory(JokeRepository())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var ind = 1

        binding.actionButton.setOnClickListener {
            viewModel.getComments(binding, ind)
            ind++
        }

        viewModel.posts.observe(this, Observer { posts ->
            val post = posts.getOrNull(ind - 1)
            if (post != null) {
                binding.nameTextView.text = post.name
                binding.emailTextView.text = post.email
                binding.bodyTextView.text = post.body
            }
        })

        viewModel.error.observe(this, Observer { error ->
            binding.nameTextView.text = error
        })



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}