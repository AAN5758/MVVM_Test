package com.example.testapp

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    val counter = ObservableField(0);

    fun increaseCounter() {
        val currentCounter = counter.get() ?: 0
        counter.set(currentCounter + 1)
    }

    fun decreaseCounter() {
        val currentCounter = counter.get() ?: 0
        counter.set(currentCounter - 1)
    }
}