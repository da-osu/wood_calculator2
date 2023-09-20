package com.example.cubic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OkparuActivity2 extends AppCompatActivity {
    EditText etokpanum,etokpaprice,etokparukparunum,etokparukpaprice,etexpensokpa;
    TextView textView2,textView,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okparu2);

        EditText etokpanum = findViewById(R.id.etokpanum);
        EditText etokpaprice = findViewById(R.id.etokpaprice);
        EditText etokparukparunum = findViewById(R.id.etokparukparunum);
        EditText etokparukpaprice = findViewById(R.id.etokparukparuprice);
        EditText etexpensokpa = findViewById(R.id.etexpensokpa);

        TextView textView2 = findViewById(R.id.textView2);
        TextView textView = findViewById(R.id.textView);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);

        Button okpabtn = findViewById(R.id.okpabtn);

        okpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input4 = etokpanum.getText().toString().trim();
                String input5 = etokpaprice.getText().toString().trim();
                String input6 = etokparukparunum.getText().toString().trim();
                String input7 = etokparukpaprice.getText().toString().trim();
                String input8 = etexpensokpa.getText().toString().trim();

                if (TextUtils.isEmpty(input4) || TextUtils.isEmpty(input5) || TextUtils.isEmpty(input6) || TextUtils.isEmpty(input7) || TextUtils.isEmpty(input8) )  {
                    textView.setText("***all fields required*** ");
                    textView2.setText("");
                    textView3.setText("");
                    textView4.setText("");


                }else{

                    int num4 = Integer.parseInt(input4);
                    int num5 = Integer.parseInt(input5);
                    int num6 = Integer.parseInt(input6);
                    int num7 = Integer.parseInt(input7);
                    int num8 = Integer.parseInt(input8);


                    int okpab = num4 - num6;
                    int good = okpab * num5;

                    int bad = num6 * num7;
                    int result = good + bad;
                    int bal = num4 * num8;

                    int boatt = num4 * num7;
                    int all = num4 + num5;
                    int get = good + bad;

                    textView2.setText("sound pcs: " + good);
                    textView.setText("okpa: " + bad);

                    textView3.setText("boat: " + bal);

                    textView4.setText("Balance: " + get);
                }
            }
        });


    }
}