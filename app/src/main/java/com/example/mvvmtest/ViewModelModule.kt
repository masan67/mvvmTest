package com.example.mvvmtest

class ViewModelModule {

    val viewModelModule = module {
        viewModel { (type: HouseType) -> DetailViewModel(type, repository = get()) }
    }

}