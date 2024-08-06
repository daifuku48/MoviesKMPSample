package org.danylnatife.samplekmpproject.core

interface Reducer<State, Event> {
    fun reduce(state: State, event: Event) : State
}