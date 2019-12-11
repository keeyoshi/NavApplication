package com.keeyoshi.navapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.keeyoshi.navapplication.R;

public class HomeFragment extends Fragment implements  View.OnClickListener{
    EditText etRadius;
    Button btnArea;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        etRadius=view.findViewById(R.id.etRadius);
        btnArea = view.findViewById(R.id.btnCalAreaOfCircle);
        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius = Integer.parseInt(etRadius.getText().toString());
        float result = 3.14f*radius*radius;
        Toast.makeText(getContext(), "The area of circle is: "+result, Toast.LENGTH_SHORT).show();
    }
}