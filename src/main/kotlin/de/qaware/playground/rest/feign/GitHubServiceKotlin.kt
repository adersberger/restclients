package de.qaware.playground.rest.feign

import de.qaware.playground.rest.Repo
import feign.Param
import feign.RequestLine

interface GitHubServiceKotlin {
    @RequestLine("GET /users/{user}/repos")
    fun listRepos(@Param("user") user: String): List<Repo>
}