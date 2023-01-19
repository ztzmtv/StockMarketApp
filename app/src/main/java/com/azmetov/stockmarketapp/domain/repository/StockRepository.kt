package com.azmetov.stockmarketapp.domain.repository

import com.azmetov.stockmarketapp.domain.model.CompanyListing
import com.azmetov.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

}