package com.kalernest.loginapp.database

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)