package com.arlanov.mvvm.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * класс отвечающий за приготовление данных для отображения их в NotificationFragment и реагирует на взаимодействие с пользователем.*/
class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}