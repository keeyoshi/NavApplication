package com.keeyoshi.navapplication.ui.slideshow;

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

public class SlideshowFragment extends Fragment implements View.OnClickListener{


    EditText etFirst, etSecond;
    Button btnSwapNumber;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
        etFirst= view.findViewById(R.id.etfirstnumber);
        etSecond= view.findViewById(R.id.etsecondNumber);
        btnSwapNumber= view.findViewById(R.id.btnswapnumber);
        btnSwapNumber.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int firstnumber=Integer.parseInt(etFirst.getText().toString()), seocondnumber=Integer.parseInt(etSecond.getText().toString());
        firstnumber=firstnumber+seocondnumber;
        seocondnumber=seocondnumber-firstnumber;
        firstnumber=firstnumber-seocondnumber;
        etFirst.setText(firstnumber);
        etSecond.setText(seocondnumber);
        Toast.makeText(getContext(), "The swap has been done!!", Toast.LENGTH_SHORT).show();
    }
}