package com.example.testdaggermodule090221

import android.util.Log
import javax.inject.Inject

class Class2 @Inject constructor(val class3: Class3) {



    fun print(){
        Log.d("TAG", "print: Class2")
        class3.print()
    }
}