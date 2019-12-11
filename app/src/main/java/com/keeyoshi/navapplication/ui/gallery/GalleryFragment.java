package com.keeyoshi.navapplication.ui.gallery;

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

public class GalleryFragment extends Fragment implements View.OnClickListener {



    EditText etNumber;
    Button btnCheckpal;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etNumber= view.findViewById(R.id.etpalNumber);
        btnCheckpal= view.findViewById(R.id.btncheckPalindrome);
        btnCheckpal.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(etNumber.getText().toString());
        int temp =number;
        int rev=0,rem=0;
        while (temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp= temp/10;
        }
        if(temp==rev)
        {
            Toast.makeText(getContext(), "The number"+rev+" is a Palindrome number", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getContext(), "The number"+rev+" is a not Palindrome number", Toast.LENGTH_SHORT).show();
        }

    }
}