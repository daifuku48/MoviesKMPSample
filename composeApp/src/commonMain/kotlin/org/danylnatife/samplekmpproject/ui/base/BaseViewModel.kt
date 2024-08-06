package org.danylnatife.samplekmpproject.ui.base

import androidx.lifecycle.ViewModel
import org.danylnatife.samplekmpproject.core.Reducer
import org.danylnatife.samplekmpproject.core.UseCase
import org.danylnatife.samplekmpproject.ui.navigation.Navigator

abstract class BaseViewModel<State, Event>(
    reducer: Reducer<State, Event>,
    useCases: Set<UseCase<State, Event>>,
    navigator: Navigator
) : ViewModel(){

}