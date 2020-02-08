package com.devzamse.pideyapp.PerfilNavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devzamse.pideyapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilNavigation extends Fragment {


    public PerfilNavigation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_navigation, container, false);
    }

}
