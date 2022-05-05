package com.kalernest.loginapp.database

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SignUp")
data class Login(
    @PrimaryKey(autoGenerate = true)
    var userId:Int = 0,


    @ColumnInfo(name = "First_Name")
    var First_Name:String,

    @ColumnInfo(name = "Last_Name")
    var Last_Name: String,

    @ColumnInfo(name = "user_name")
    var userName: String,

    @ColumnInfo(name = "Email")
    val Email: String,

    @ColumnInfo(name = "Phone")
    val Phone:Int,

    @ColumnInfo(name = "Place_of_Residence")
    val Place_of_Residence:String,

    @ColumnInfo(name="password_text")
    val password_text:String,



    )