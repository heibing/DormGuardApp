package com.example.lars.dormguardapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {




    public MainFragment() {
        // Required empty public constructor
    }


    RelativeLayout r;
    ToggleButton t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        t = (ToggleButton) rootView.findViewById(R.id.toggleButton);
        r = (RelativeLayout) rootView.findViewById(R.id.layout);

        t.setOnCheckedChangeListener(this);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b)
        {
            r.setBackgroundColor(Color.RED);
        }
        else
        {
            r.setBackgroundColor(Color.GREEN);
        }
    }
}

