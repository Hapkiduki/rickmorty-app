package com.hapkiduki.rickandmorty.ui.detail

import com.hapkiduki.rickandmorty.domain.model.Character

data class DetailState(
    val character: Character? = null,
    val isLoading: Boolean = false
)
