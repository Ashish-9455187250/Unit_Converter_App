package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Widgets
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.Textview1);
        TextView textView2 = findViewById(R.id.Textview2);

        // Assigning the button its function

        // onClickListener method used to tell the button its function on clicking it

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Taking kilograms as a String as an input
                String kilograms = editText.getText().toString();

                // defining kilos variable as float
                float kilos = Float.parseFloat(kilograms); /* Parsing the kilograms from String
                to float */

                /* Defining a pounds variable and typecasting the kilos into Float */
                float pounds = (float) (kilos * 2.20462);
                textView.setText("" + pounds);
            }
        });


    }
}