package com.kalernest.loginapp.database

import android.util.Log
import androidx.lifecycle.LiveData

class LoginRepository(private val dao: LoginDatabaseDao) {
    val users = dao.getAllUsers()

    suspend fun insert(user:Login) {
        return dao.insert(user)

    }

    suspend fun getUserName(userName: String):Login?{
        return dao.getUsername(userName)
    }
}
