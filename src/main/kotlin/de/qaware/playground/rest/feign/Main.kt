package de.qaware.playground.rest.feign

import feign.Feign
import feign.gson.GsonDecoder

fun main(args: Array<String>) {
    val github = Feign.builder()
            .decoder(GsonDecoder())
            .target(GitHubServiceKotlin::class.java, "https://api.github.com")
    val repos = github.listRepos("qaware")
    for (repo in repos) {
        println(repo)
    }
}