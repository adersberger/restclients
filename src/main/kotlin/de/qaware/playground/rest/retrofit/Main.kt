package de.qaware.playground.rest.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun main(args : Array<String>) {
    val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    val service = retrofit.create(GitHubServiceKotlin::class.java)
    val repos = service.listRepos("qaware")

    for (repo in repos.execute().body())
    {
        println(repo.toString())
    }
}