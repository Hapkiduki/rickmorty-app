package com.hapkiduki.rickandmorty.ui.home

import com.hapkiduki.rickandmorty.domain.model.Characters

data class HomeState(
    val characters: List<Characters> = emptyList(),
    val showPrevious: Boolean = false,
    val showNext: Boolean = true,
    val isLoading: Boolean = false,
)
