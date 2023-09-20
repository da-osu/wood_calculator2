package com.example.cubic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.maincalbtn);
        Button kparukparubtn = findViewById(R.id.kparukparubtn);
        Button okparumiss = findViewById(R.id.okparumiss);
        Button missbtn = findViewById(R.id.missbtn);
        Button aboutbtn = findViewById(R.id.aboutbtn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstintent = new Intent(MainActivity.this,MainCal2.class);
                startActivity(firstintent);
            }
        });
        kparukparubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent okpaintent = new Intent(MainActivity.this,OkparuActivity2.class);
                startActivity(okpaintent);
            }
        });

        okparumiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent okpamissintent = new Intent(MainActivity.this,okpaMissActivity2.class);
                startActivity(okpamissintent);
            }
        });
        missbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missintent = new Intent(MainActivity.this,MissActivity2.class);
                startActivity(missintent);
            }
        });
        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutintent = new Intent(MainActivity.this,AboutActivity2.class);
                startActivity(aboutintent);
            }
        });
    }
    }
