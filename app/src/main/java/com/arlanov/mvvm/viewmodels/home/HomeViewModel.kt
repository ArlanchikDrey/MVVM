package com.arlanov.mvvm.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.SavedStateHandle

import com.arlanov.mvvm.viewmodels.home.model.User

/**
 * класс отвечающий за приготовление данных для отображения их в HomeFragment
 * и реагирует на взаимодействие с пользователем.
 *
 * SavedStateHandle в аргументе позволяет ViewModel получить доступ к сохраненному состоянию
 * и аргументам связанного фрагмента или действия.*/

class HomeViewModel(
    savedStateHanle: SavedStateHandle
) : ViewModel() {

    val userId : String = savedStateHanle["uid"] ?: throw IllegalArgumentException("missing user id")
    val user : User = TODO()
}