package com.kalernest.loginapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.lifecycle.LiveData
import androidx.room.Delete

@Dao
interface LoginDatabaseDao {

    @Insert
    suspend fun insert(login:Login)




    @Query("SELECT *FROM SignUp ORDER BY userId DESC")
    fun getAllUsers():LiveData<List<Login>>

    @Query("SELECT * FROM SignUp WHERE  First_Name LIKE :First_Name")
    suspend fun getUsername(First_Name:String):Login?

}