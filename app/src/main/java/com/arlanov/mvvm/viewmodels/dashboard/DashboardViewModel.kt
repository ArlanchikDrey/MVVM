package com.arlanov.mvvm.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * класс отвечающий за приготовление данных для отображения их в DashboardFragment и реагирует на взаимодействие с пользователем.*/
class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}