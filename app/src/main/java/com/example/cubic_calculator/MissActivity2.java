package com.example.cubic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MissActivity2 extends AppCompatActivity {
    EditText mnum,mmiss,mprice,mexpens;
    TextView tview1,tview2,tview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miss2);

        EditText mnum = findViewById(R.id.mnum);
        EditText mmiss = findViewById(R.id.mmiss);
        EditText mprice = findViewById(R.id.mprice);
        EditText mexpens = findViewById(R.id.mexpens);

        TextView tview1 = findViewById(R.id.tview1);
        TextView tview2 = findViewById(R.id.tview2);
        TextView tview3 =findViewById(R.id.tview3);

        Button mbtn = findViewById(R.id.mbtn);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = mnum.getText().toString().trim();
                String input2 = mmiss.getText().toString().trim();
                String input3 = mprice.getText().toString().trim();
                String input4 = mexpens.getText().toString().trim();

                if (TextUtils.isEmpty(input1) || TextUtils.isEmpty(input2) ||TextUtils.isEmpty(input3) ||TextUtils.isEmpty(input4) )
                {
                    tview1.setText("all field required!!!");
                    tview2.setText("");
                    tview3.setText("");
                }else{
                    int num1 = Integer.parseInt(input1);

                    int num2 = Integer.parseInt(input2);
                    int num3 = Integer.parseInt(input3);
                    int num4 = Integer.parseInt(input4);

                    int add = num1 - num2;
                    int total = add * num3;

                    int loss = num1 * num4;

                    int balance = total - loss;

                    tview1.setText("total: " + total);

                    tview2.setText("boat: " + loss);
                    tview2.setTextColor(Color.RED);

                    tview3.setText("balance: " + balance);
                    tview3.setTextColor(Color.BLUE);

                }
            }
        });
    }
}