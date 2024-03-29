package com.arlanov.mvvm.ui.notifications.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.arlanov.mvvm.R
import com.arlanov.mvvm.ui.notifications.NotificationsViewModel
import kotlinx.android.synthetic.main.fragment_notifications.*

/**
 * класс служит контроллером пользовательского интерфейса, который отвечает за отображение информации пользователю.*/
class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        notificationsViewModel.text.observe(this, Observer {
            text_notifications.text = it
        })
        return root
    }
}