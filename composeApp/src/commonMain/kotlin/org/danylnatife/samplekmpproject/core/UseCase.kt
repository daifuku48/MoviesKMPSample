package org.danylnatife.samplekmpproject.core

interface UseCase<State, Event> {
    fun execute(state: State, event: Event) : Event
    fun canExecute(event: Event) : Boolean
}