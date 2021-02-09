package com.example.testdaggermodule090221


import dagger.Component

@Component
interface AppComponent {

    // Classes that can be injected by this Component.
    fun inject(activity: MainActivity)
}