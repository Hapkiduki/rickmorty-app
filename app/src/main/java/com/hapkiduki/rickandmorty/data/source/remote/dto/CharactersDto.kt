package com.hapkiduki.rickandmorty.data.source.remote.dto

import com.hapkiduki.rickandmorty.domain.model.Characters

data class CharactersDto(
    val info: Info,
    val results: List<CharacterDto>
)

fun CharactersDto.toListCharacters(): List<Characters> {
    val resultEntries = results.map { entries ->
        Characters(
            id = entries.id,
            name = entries.name,
            specie = entries.species,
            image = entries.image
        )
    }

    return resultEntries
}