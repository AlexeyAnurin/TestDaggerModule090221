package com.example.testdaggermodule090221

import android.util.Log
import javax.inject.Inject

//class Class3 @Inject constructor(val x: Int = 5) {
class Class3 @Inject constructor() {
    fun print(){
        Log.d("TAG", "print: Class3")
    }
}