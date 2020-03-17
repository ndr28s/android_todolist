package com.example.todolist.ui.done

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DoneViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Done Fragment"
    }
    val text: LiveData<String> = _text
}