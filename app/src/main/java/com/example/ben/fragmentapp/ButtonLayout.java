package com.example.ben.fragmentapp;

/**
 * Created by Mine BAYRAKDAR on 5.12.2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ButtonLayout extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.button_layout, container,false);
        return view;
    }
}