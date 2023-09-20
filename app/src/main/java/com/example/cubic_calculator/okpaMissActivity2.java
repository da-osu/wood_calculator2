package com.example.cubic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class okpaMissActivity2 extends AppCompatActivity {
    EditText omnum,ommiss,omprice,omokpanum,omokpaprice,omexpens;
    TextView view1,view2,view3,view4;

    EditText missing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okpa_miss2);

        EditText omnum = findViewById(R.id.omnum);
        EditText ommiss = findViewById(R.id.ommiss);
        EditText omprice = findViewById(R.id.omprice);
        EditText omokpanum = findViewById(R.id.omokpanum);
        EditText omokpaprice =findViewById(R.id.omokpaprice);
        EditText omexpens = findViewById(R.id.omexpens);

        TextView view1 = findViewById(R.id.view1);
        TextView view2 = findViewById(R.id.view2);
        TextView view3= findViewById(R.id.view3);
        TextView view4= findViewById(R.id.view4);

        Button ombtn = findViewById(R.id.ombtn);


        ombtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String put1 = omnum.getText().toString().trim();
                String put2 = ommiss.getText().toString().trim();
                String put3 = omprice.getText().toString().trim();
                String put4 = omokpanum.getText().toString().trim();
                String put5 = omokpaprice.getText().toString().trim();
                String put6 = omexpens.getText().toString().trim();

                if (TextUtils.isEmpty(put1) ||TextUtils.isEmpty(put2) ||TextUtils.isEmpty(put3) ||TextUtils.isEmpty(put4) ||TextUtils.isEmpty(put5) ||TextUtils.isEmpty(put6) )
                {
                    view1.setText("please fill all");
                    view2.setText("");
                    view3.setText("");
                    view4.setText("");
                }else
                {
                    int da = Integer.parseInt(put1);
                    int so = Integer.parseInt(put2);
                    int fa = Integer.parseInt(put3);
                    int me = Integer.parseInt(put4);
                    int ra = Integer.parseInt(put5);
                    int dd = Integer.parseInt(put6);


                    int sss = da - so - me;
                    int sda = sss * fa;
                    view1.setText("sound pcs: " + sda);

                    int sso = me * ra;
                    view3.setText("okpa: " + sso);

                    int ddd = da * dd;
                    view2.setText("boat: " + ddd);

                    int bal = sda + sso;
                    int mainbal = bal - ddd;
                    view4.setText("balance: " + mainbal);
                }
            }
        });

    }
}