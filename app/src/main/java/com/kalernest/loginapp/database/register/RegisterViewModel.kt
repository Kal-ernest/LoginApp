package com.kalernest.loginapp.database.register

import android.util.Log
import kotlinx.coroutines.Job

fun sumbitButton() {
    if (inputFirstName.value == null || inputLastName.value == null || inputUsername.value == null || inputPassword.value == null) {
        _errorToast.value = true
    } else {
        uiScope.launch {
            val usersNames = repository.getUserName(inputUsername.value!!)
            if (usersNames != null) {
                _errorToastUsername.value = true
            } else {
                val firstName = inputFirstName.value!!
                val lastName = inputLastName.value!!
                val email = inputUsername.value!!
                val password = inputPassword.value!!
                insert(RegisterEntity(0, firstName, lastName, email, password))
                inputFirstName.value = null
                inputLastName.value = null
                inputUsername.value = null
                inputPassword.value = null
                _navigateto.value = true
            }
        }
        // To be repositioned
        private fun insert(user: RegisterEntity): Job = viewModelScope.launch {
            repository.insert(user)

            registerViewModel.navigateto.observe(this, Observer { hasFinished->
                if (hasFinished == true){
                    Log.i("MYTAG","insidi observe")
                    displayUsersList()
                    registerViewModel.doneNavigating()
                }
            })

            return binding.root
        }

        private fun displayUsersList() {
            val action = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
            NavHostFragment.findNavController(this).navigate(action)

        }
        }
    }
}