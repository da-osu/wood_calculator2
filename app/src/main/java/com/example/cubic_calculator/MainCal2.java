package com.example.cubic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainCal2 extends AppCompatActivity {
    EditText etnum,etprice,etexpens;
    TextView maincalresult,priceresult,balanceresult;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cal2);

        EditText etnum = findViewById(R.id.etnum);
        EditText etprice = findViewById(R.id.etprice);
        EditText etexpens = findViewById(R.id.etexpens);

        TextView maincalresult = findViewById(R.id.maincalresult);
        TextView priceresult = findViewById(R.id.priceresult);
        TextView balanceresult = findViewById(R.id.balanceresult);


        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = etnum.getText().toString().trim();
                String input2 = etprice.getText().toString().trim();
                String input3 = etexpens.getText().toString().trim();

                if (TextUtils.isEmpty(input1) || TextUtils.isEmpty(input2) || TextUtils.isEmpty(input3) )  {
                    maincalresult.setText("***all fields required*** ");

                    priceresult.setText("* *");

                    balanceresult.setText("* * *");


                }else{

                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int num3 = Integer.parseInt(input3);

                    int result = num1 * num2;
                    int boatt = num1 * num3;
                    int bal = result - boatt;


                    maincalresult.setText("total: " + result);
                    priceresult.setText("boat: " + boatt);
                    balanceresult.setText("Balance: " + bal);
                }
            }
        });
    }
}