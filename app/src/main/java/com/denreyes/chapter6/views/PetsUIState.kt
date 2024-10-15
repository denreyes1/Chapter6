package com.denreyes.chapter6.views

import com.denreyes.chapter6.data.Cat

data class PetsUIState(
    val isLoading: Boolean = false,
    val pets: List<Cat> = emptyList(),
    val error: String? = null
)