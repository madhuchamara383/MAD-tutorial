package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    EditText editTextNumber2,editTextNumber3;


    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editTextNumber2 = (EditText)findViewById(R.id.editTextNumber2);

        editTextNumber3=(EditText)findViewById(R.id.editTextNumber3);

        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("n1",editTextNumber2.getText().toString());
                intent.putExtra("n2",editTextNumber3.getText().toString());


                LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.custometoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));
//Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();
                startActivity(intent);
            }
        });

    }


}