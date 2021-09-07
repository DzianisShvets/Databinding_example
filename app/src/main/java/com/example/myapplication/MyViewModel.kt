package com.example.myapplication

import android.content.Context
import android.widget.Toast

class MyViewModel {

    lateinit var Par1 : String
    var Par2 : Int
    lateinit var Con: Context

    constructor(Par1: String, Par2: Int, Con: Context) {
        this.Par1 = Par1
        this.Par2 = Par2
        this.Con = Con
    }


    fun Method1(){
        val toast = Toast.makeText(Con, "Hello", Toast.LENGTH_LONG)
        toast.show()
    }

}