package com.example.progettomobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.progettomobile.RecyclerView.CardAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // setRecyclerView(this);
        Utilities.insertFragment(this,  new HomeFragment(), HomeFragment.class.getSimpleName());

    }


}