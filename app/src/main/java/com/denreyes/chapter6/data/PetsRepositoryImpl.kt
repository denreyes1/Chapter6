package com.denreyes.chapter6.data

import android.util.Log
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class PetsRepositoryImpl(
    private val catsAPI: CatsAPI,
    private val dispatcher: CoroutineDispatcher
): PetsRepository {

    override suspend fun getPets(): NetworkResult<List<Cat>> {
        return withContext(dispatcher) {
            try {
                val response = catsAPI.fetchCatsRaw("cute")
                if(response.isSuccessful) {
                    Log.i("DENSHO", "success: ${response.body()!!}")
                    NetworkResult.Success(response.body()!!)
                } else {
                    Log.i("DENSHO", "error: ${response.errorBody().toString()}")
                    NetworkResult.Error(response.errorBody().toString())
                }

                NetworkResult.Success(ArrayList<Cat>())


//                val response = catsAPI.fetchCats("")
//                if(response.isSuccessful) {
//                    NetworkResult.Success(response.body()!!)
//                } else {
//                    NetworkResult.Error(response.errorBody().toString())
//                }
            } catch (e: Exception) {
                NetworkResult.Error(e.message ?: "Unknown error")
            }
        }
    }

}