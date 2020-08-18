package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTextNumber2,editTextNumber3;
    String number1;
    String number2;
    TextView lblsum;

    int n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextNumber2 = findViewById(R.id.editTextNumberSigned);
        editTextNumber3 = findViewById(R.id.editTextNumberSigned2);
        lblsum=findViewById(R.id.lblsum);

        Intent intent = getIntent();

        String number1 =intent.getStringExtra("n1");

        String number2 =intent.getStringExtra("n2");

        editTextNumber2.setText(number1);
        editTextNumber3.setText(number2);

        n1 =Integer.parseInt(number1);
        n2 =Integer.parseInt(number2);

    }

    public void add(View view){

        lblsum.setText(number1 + "+" + number2 + "=" + (n1+n2));

    }


    public void substract(View view){

        lblsum.setText(number1 + "-" + number2 + "=" + (n1-n2));

    }


    public void multiply(View view){

        lblsum.setText(number1 + "*" + number2 + "=" + (n1*n2));

    }


    public void divide(View view){

        lblsum.setText(number1 + "/" + number2 + "=" + (n1/n2));

    }


}