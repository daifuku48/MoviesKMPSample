package org.danylnatife.samplekmpproject.domain.movieList

sealed class MovieListEvent {
    data object GetMoviesEvent : MovieListEvent()
    data class MoviesReceivedEvent(val movies: List<String>) : MovieListEvent()
    data object MoviesErrorEvent : MovieListEvent()
    data object ErrorEvent : MovieListEvent()
}