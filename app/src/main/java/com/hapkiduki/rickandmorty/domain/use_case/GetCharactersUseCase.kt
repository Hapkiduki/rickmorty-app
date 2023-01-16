package com.hapkiduki.rickandmorty.domain.use_case

import com.hapkiduki.rickandmorty.data.Result
import com.hapkiduki.rickandmorty.domain.model.Characters
import com.hapkiduki.rickandmorty.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke(page: Int): Flow<Result<List<Characters>>> {
        return repository.getCharacters(page)
    }
}