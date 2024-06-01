When you click on the button via the API using Retrofit, a post with an id different from the previous one by one is taken

![image](https://github.com/PhilippKroger/JokeApp/assets/66637696/0d0bdc12-7d24-40c4-9c96-255a79ef0156)


<h3>Project Description</h3><br>
This Android application is built using Kotlin and follows the MVVM (Model-View-ViewModel) architecture. It demonstrates how to fetch and display data from an API using Retrofit for network calls. The project is structured to ensure clear separation of concerns, maintainability, and scalability.

<h6>Key Components:</h6><br>
<b>Core Layer:</b><br>

<b>Data:</b> <br>
<b>API:</b> Contains the PostService interface for API endpoints and RetrofitInstance for Retrofit configuration.<br>
<b>Model:</b> Defines the Post data class representing the structure of the API response.<br>
<b>Repository:</b> The PostRepository class handles data operations and abstracts the data source.<br>
<b>Presentation Layer:</b><br>

<b>ViewModel:</b><br>
<b>MainViewModel:</b> Manages the data for the UI and handles business logic.<br>
<b>MainViewModelFactory:</b> A factory class to instantiate MainViewModel with required dependencies.<br>
<b>View:</b><br>
<b>MainActivity:</b> The main UI component that displays the data fetched from the API and interacts with the MainViewModel.<br>
<b>Features:</b><br>
Fetches and displays comments from the JSONPlaceholder API.<br>
Implements Retrofit for network requests.<br>
Uses LiveData for observing data changes.<br>
Follows the MVVM architecture to ensure a clean separation of concerns.<br>
This project is a good starting point for understanding how to structure an Android application using modern best practices and architectural patterns.<br>
