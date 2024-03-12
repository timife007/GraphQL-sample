package com.timife.graphql_sample

import com.apollographql.apollo3.ApolloClient
import com.timife.FindCountriesOfAContinentQuery
import com.timife.GetContinentsQuery

class ApolloRepository(private val apollo: ApolloClient) {
    suspend fun getContinents() = apollo.query(GetContinentsQuery()).execute()

    suspend fun getCountriesOfSelectedContinent(continentCode: String) = apollo.query(
        FindCountriesOfAContinentQuery(continentCode)
    ).execute()
}