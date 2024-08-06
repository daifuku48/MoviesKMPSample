package org.danylnatife.samplekmpproject.ui.movieList

import org.danylnatife.samplekmpproject.core.Reducer
import org.danylnatife.samplekmpproject.core.UseCase
import org.danylnatife.samplekmpproject.domain.movieList.MovieListEvent
import org.danylnatife.samplekmpproject.domain.movieList.MovieListState
import org.danylnatife.samplekmpproject.ui.base.BaseViewModel
import org.danylnatife.samplekmpproject.ui.navigation.Navigator
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MovieListViewModel(
    reducer: Reducer<MovieListState, MovieListEvent>,
    useCases: Set<UseCase<MovieListState, MovieListEvent>>,
    navigator: Navigator
) : BaseViewModel<MovieListState, MovieListEvent>(reducer, useCases, navigator) {
}