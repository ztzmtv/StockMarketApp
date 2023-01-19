package com.azmetov.stockmarketapp.domain.repository

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)
