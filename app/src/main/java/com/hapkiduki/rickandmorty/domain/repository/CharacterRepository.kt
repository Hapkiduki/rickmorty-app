package com.hapkiduki.rickandmorty.domain.repository

import com.hapkiduki.rickandmorty.domain.model.Characters
import com.hapkiduki.rickandmorty.domain.model.Character
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacters(page: Int): Flow<com.hapkiduki.rickandmorty.data.Result<List<Characters>>>

    suspend fun getCharacter(id: Int): com.hapkiduki.rickandmorty.data.Result<Character>
}