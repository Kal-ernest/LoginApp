package com.kalernest.loginapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UserDetailsViewModel {

    val users = repository.users


    private val _navigateto = MutableLiveData<Boolean>()

    val navigateto: LiveData<Boolean>
        get() = _navigateto

    fun doneNavigating(){
        _navigateto.value=false
    }

    fun backButtonclicked(){
        _navigateto.value = true
    }


}