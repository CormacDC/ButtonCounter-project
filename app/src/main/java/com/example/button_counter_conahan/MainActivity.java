package com.example.button_counter_conahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.*;

import android.view.*;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    private Button button1;
    private Button decimal;
    private Button binary;
    private Button hexadecimal;

    private TextView numDisplay;

    private boolean decBool = true;
    private boolean binBool = false;
    private boolean hexBool = false;

    private int val = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numDisplay = findViewById(R.id.numDisplay);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if(decBool)
                    incrementDecimal();
                if(binBool)
                    incrementBinary();
                if(hexBool)
                    incrementHexadecimal();

            }
        });

        decimal = findViewById(R.id.decimal);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                val = 0;

                numDisplay.setText("0");

                decBool = true;
                hexBool = false;
                binBool = false;

            }
        });

        binary = findViewById(R.id.binary);
        binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                val = 0;

                numDisplay.setText("0");

                decBool = false;
                hexBool = false;
                binBool = true;

            }
        });

        hexadecimal = findViewById(R.id.hexadecimal);
        hexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                val = 0;

                numDisplay.setText("0");

                decBool = false;
                hexBool = true;
                binBool = false;

            }
        });
    }

    private void incrementDecimal(){

        val++;

        numDisplay.setText(String.valueOf(val));

    }

    private void incrementBinary(){

        val++;

        numDisplay.setText(Integer.toString(val,2));

    }

    private void incrementHexadecimal(){

        val++;

        numDisplay.setText(Integer.toString(val,16));

    }

}