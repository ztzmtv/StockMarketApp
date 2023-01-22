package com.azmetov.stockmarketapp.di

import com.azmetov.stockmarketapp.data.StockRepositoryImpl
import com.azmetov.stockmarketapp.data.csv.CSVParser
import com.azmetov.stockmarketapp.data.csv.CompanyListingParser
import com.azmetov.stockmarketapp.domain.model.CompanyListing
import com.azmetov.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}