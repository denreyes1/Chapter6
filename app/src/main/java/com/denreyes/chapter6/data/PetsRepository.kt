package com.denreyes.chapter6.data

interface PetsRepository {
    suspend fun getPets(): NetworkResult<List<Cat>>
}