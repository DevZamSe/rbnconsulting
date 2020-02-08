package com.devzamse.appoficial.InicioNavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devzamse.appoficial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioNavigation extends Fragment {


    public InicioNavigation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio_navigation, container, false);
    }

}
