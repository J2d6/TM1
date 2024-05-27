package dev.j2d6.tm1.ui.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TMIViewModel : ViewModel() {
    private var _tmState = MutableStateFlow(TM1State())
    val tmState = _tmState.asStateFlow()

    fun updateState(state : TM1State) {
        _tmState.value = state
    }
}