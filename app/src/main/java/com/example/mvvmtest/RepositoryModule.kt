package com.example.mvvmtest

class RepositoryModule {

    val repositoryModule = module {
        single<Repository> { RepositoryImpl(remoteDataSource = get()) }
    }
}