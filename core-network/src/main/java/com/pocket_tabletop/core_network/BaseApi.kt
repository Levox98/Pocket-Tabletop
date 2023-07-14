package com.pocket_tabletop.core_network

import android.util.Log
import com.pocket_tabletop.core.AppError
import com.pocket_tabletop.core.Either
import com.pocket_tabletop.core_network.entity.ApiResponse
import retrofit2.Response


abstract class BaseApi {
    suspend fun <T> doRequest(name: String = "", request: suspend () -> Either<T>): Either<T> {
        return try {
            request()
        } catch (e: Exception) {
            Log.d("API_ERROR", "$name ${e.message}")
            Either.error(AppError.Unknown(e.message ?: ""))
        }
    }

    suspend fun <E, R> doRequest(
        tag: String = "",
        request: suspend () -> Response<R>,
        mapper: suspend (R?) -> E?,
    ): Either<E> {
        return try {
            val response = request()
            if (response.isSuccessful) {
                val result = response.body() as ApiResponse
                if (result.count != null) {
                    Either.success(mapper(response.body()))
                } else {
                    Either.error(AppError.Unknown("Unknown error"))
                }
            } else {
                Either.error(AppError.Unknown("Response unsuccessful"))
            }
        } catch (e: Exception) {
            Log.e("API_ERROR", "${e.message}")
            Either.error(AppError.Unknown(e.message ?: ""))
        }
    }
}