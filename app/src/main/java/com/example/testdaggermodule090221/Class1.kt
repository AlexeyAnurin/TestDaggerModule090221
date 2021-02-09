package com.example.testdaggermodule090221

import javax.inject.Inject

class Class1 @Inject constructor(class2: Class2) {
    init {
        class2.print()
    }
}