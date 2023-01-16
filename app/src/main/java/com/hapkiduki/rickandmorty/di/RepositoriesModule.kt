package com.hapkiduki.rickandmorty.di

import com.hapkiduki.rickandmorty.data.repository.CharacterRepositoryImpl
import com.hapkiduki.rickandmorty.domain.repository.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun bindCharacterRepository(impl: CharacterRepositoryImpl) : CharacterRepository
}