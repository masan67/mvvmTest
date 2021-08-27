package com.example.mvvmtest

interface Repository {

    suspend fun getCharacters(type: String) : List<Character>

}