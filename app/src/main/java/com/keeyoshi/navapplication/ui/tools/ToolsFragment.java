package com.keeyoshi.navapplication.ui.tools;

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

public class ToolsFragment extends Fragment implements View.OnClickListener{
    EditText etnumber;
    Button btnSquare;
    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tools, container, false);
        etnumber =view.findViewById(R.id.etsquarenumber);
        btnSquare = view.findViewById(R.id.btnautomorphic);
        btnSquare.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int number= Integer.parseInt(etnumber.getText().toString());
        int result = number*number;
        int rem = result%10;
        if(rem==number)
            Toast.makeText(getContext(), "The number is: "+result+ " is a Automorpicnumber", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getContext(), "The number is: "+result+ " is not Automorpicnumber", Toast.LENGTH_SHORT).show();
    }
}