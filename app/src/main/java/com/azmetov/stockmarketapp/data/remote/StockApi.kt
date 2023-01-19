package com.azmetov.stockmarketapp.data.remote


import com.azmetov.stockmarketapp.BuildConfig
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTINGS_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody

    companion object {
        private const val API_KEY = BuildConfig.API_KEY
        private const val BASE_URL = "https://alphavantage.co"
    }
}