package com.kalernest.loginapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UserDetailsViewModel {


    // The current temperature
    val bodyTemperature = MutableLiveData<Int>()
    // The current pulseRate
    val pulseRate = MutableLiveData<Int>()

    //The current oxyRate
    val oxyRate = MutableLiveData<Int>()

    init {
        bodyTemperature.value = 0
        pulseRate.value = 0
        oxyRate.value

    }

    fun onSkip(){
        bodyTemperature.value = (bodyTemperature.value)?.minus(1)
        pulseRate.value = (pulseRate.value)?.minus(1)
        oxyRate.value = (oxyRate.value)?.minus(1)

    }

    /** Methods for updating the UI **/
    private fun updateBodyTemp() {
        binding.bodyTemperature.value = viewModel.bodyTemperature.value

        
    }

    private fun updatepulseRate() {
        binding.pulseRate.value = viewModel.pulseRate.value
    }

    private fun updateoxyRate(){

        binding.oxyRate.value = viewModel.oxyRate.value
    }

    
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