package com.kalernest.loginapp.database.login

import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.AndroidViewModel
import com.kalernest.loginapp.database.LoginRepository
import java.util.*

class LoginViewModel(private val repository: LoginRepository, application: Application) :
AndroidViewModel(application), Observable {

    val users = repository.users

    @Bindable
    val inputUsername = mutableLiveData<String>()

    //Function triggered When the Login Button is Clicked, Via Binding.
    fun loginButton() {
        //-------Logic for the code
    }

    fun signUP() {
        //navigate to the Register Fragment
    }



    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }


}


}