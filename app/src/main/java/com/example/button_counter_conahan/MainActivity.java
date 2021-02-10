package com.example.button_counter_conahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.*;

import android.view.*;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    private Button button1;

    private TextView numDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numDisplay = findViewById(R.id.numDisplay);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                increment();

            }
        });
    }

    private void increment(){

        int val = Integer.valueOf(numDisplay.getText().toString());
        val++;

        numDisplay.setText(String.valueOf(val));

    }

}