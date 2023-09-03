package com.example.testgraphql.data

import com.example.CountriesQuery
import com.example.CountryQuery
import com.example.testgraphql.domain.DetailedCountry
import com.example.testgraphql.domain.SimpleCountry

fun CountryQuery.Country.toDetailedCountry() = DetailedCountry(
    code = code,
    name = name,
    emoji = emoji,
    capital = capital ?: "No capital",
    currency = currency ?: "No currency",
    languages = languages.mapNotNull { it.name },
    continent = continent.name
)

fun CountriesQuery.Country.toSimpleCountry() = SimpleCountry(
    code = code,
    name = name,
    emoji = emoji,
    capital = capital ?: "No capital",
)