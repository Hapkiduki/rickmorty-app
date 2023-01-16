package com.hapkiduki.rickandmorty.data.source.remote.dto

import com.hapkiduki.rickandmorty.domain.model.Character

data class CharacterDto(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun CharacterDto.toCharacter(): Character {
    return Character(
        id,
        name,
        status,
        species,
        gender,
        origin,
        location,
        image
    )
}