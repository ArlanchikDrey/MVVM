package com.arlanov.mvvm.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.SavedStateHandle

import com.arlanov.mvvm.viewmodels.home.model.User

/**
 * класс отвечающий за приготовление данных для отображения их в HomeFragment
 * и реагирует на взаимодействие с пользователем.
 * 
 * HomeViewModel автоматически восстанавливается при изменении конфигурации,
 * поэтому, как только создается новый фрагмент HomeFragment,
 * он получает тот же экземпляр ViewModel, и обратный вызов вызывается немедленно с использованием текущих данных
 *
 * SavedStateHandle в аргументе позволяет ViewModel получить доступ к сохраненному состоянию
 * и аргументам связанного фрагмента или действия.*/

class HomeViewModel(
    savedStateHanle: SavedStateHandle
) : ViewModel() {

    val userId : String = savedStateHanle["uid"] ?: throw IllegalArgumentException("missing user id")

    /**
     *  Теперь HomeFragment информируется об обновлении данных.
     *  Кроме того, поскольку это поле LiveData поддерживает жизненный цикл,
     *  оно автоматически очищает ссылки, когда они больше не нужны.*/
    val user : LiveData<User> = TODO()
}