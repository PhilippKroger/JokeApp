When you click on the button via the API using Retrofit, a post with an id different from the previous one by one is taken

![image](https://github.com/PhilippKroger/JokeApp/assets/66637696/0d0bdc12-7d24-40c4-9c96-255a79ef0156)


Project Description
This Android application is built using Kotlin and follows the MVVM (Model-View-ViewModel) architecture. It demonstrates how to fetch and display data from an API using Retrofit for network calls. The project is structured to ensure clear separation of concerns, maintainability, and scalability.

Key Components:
Core Layer:

Data:
API: Contains the PostService interface for API endpoints and RetrofitInstance for Retrofit configuration.
Model: Defines the Post data class representing the structure of the API response.
Repository: The PostRepository class handles data operations and abstracts the data source.
Presentation Layer:

ViewModel:
MainViewModel: Manages the data for the UI and handles business logic.
MainViewModelFactory: A factory class to instantiate MainViewModel with required dependencies.
View:
MainActivity: The main UI component that displays the data fetched from the API and interacts with the MainViewModel.
Features:
Fetches and displays comments from the JSONPlaceholder API.
Implements Retrofit for network requests.
Uses LiveData for observing data changes.
Follows the MVVM architecture to ensure a clean separation of concerns.
This project is a good starting point for understanding how to structure an Android application using modern best practices and architectural patterns.
