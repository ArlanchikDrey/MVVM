package com.arlanov.mvvm.ui.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.SavedStateVMFactory
import androidx.lifecycle.ViewModelProviders
import com.arlanov.mvvm.R
import com.arlanov.mvvm.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * класс служит контроллером пользовательского интерфейса, который отвечает за отображение информации пользователю.*/
class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this,SavedStateVMFactory(this)).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}