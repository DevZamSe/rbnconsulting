package com.techtoserve.tarotapp.Views.Tarot


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.techtoserve.tarotapp.R

/**
 * A simple [Fragment] subclass.
 */
class NumCartas : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_num_cartas, container, false)
    }


}
