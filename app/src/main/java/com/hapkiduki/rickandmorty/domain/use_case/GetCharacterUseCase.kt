package com.hapkiduki.rickandmorty.domain.use_case

import com.hapkiduki.rickandmorty.domain.repository.CharacterRepository
import javax.inject.Inject
import com.hapkiduki.rickandmorty.domain.model.Character
import com.hapkiduki.rickandmorty.data.Result

class GetCharacterUseCase @Inject constructor(
    private val respository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Result<Character> {
        return respository.getCharacter(id)
    }
}