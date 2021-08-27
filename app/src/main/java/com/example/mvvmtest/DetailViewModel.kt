package com.example.mvvmtest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class DetailViewModel(house: HouseType, private val repository: Repository) : ViewModel() {

    val characterList : LiveData<List<Character>> = liveData(Dispatchers.IO) {
        loading.postValue(true)
        emit(repository.getCharacters(house.name))
    }

    val loading = MutableLiveData<Boolean>()

}