package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.math.BigDecimal;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText number = (EditText)findViewById(R.id.number);
        System.out.println("Number is " + number.getText().toString());

        if(!(number.getText().toString().isEmpty()))
        {
            Toast.makeText(this, number.getText().toString()+ " dollars in rupees is "
                    + (long)73.5*Long.parseLong(number.getText().toString())+" INR", Toast.LENGTH_LONG).show();

        }

        else
            {
                Toast.makeText(this, "Plz enter a number. ", Toast.LENGTH_SHORT).show();
            }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}