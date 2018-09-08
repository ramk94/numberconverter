package com.example.badribhattarai.numbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class numbersystem extends AppCompatActivity {

    private Button button_id;
    private Button button_id2;
    private Button button_id3;
    private Button button_id4;
    private Button button_id5;
    private Button button_id6;

    public void init() {
        button_id = findViewById(R.id.button_id);
        button_id2 = findViewById(R.id.button_id2);
        button_id3 = findViewById(R.id.button_id3);
        button_id4 = findViewById(R.id.button_id4);
        button_id5 = findViewById(R.id.button_id5);
        button_id6 = findViewById(R.id.button_id6);

        button_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(numbersystem.this, BINTODEC.class);
                startActivity(action);
            }
        });

        button_id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(numbersystem.this, dectobinary.class);
                startActivity(action);
            }
        });

        button_id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(numbersystem.this, bintohex.class);
                startActivity(action);
            }
        });

        button_id4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(numbersystem.this, hextobin.class);
                startActivity(action);
            }
        });

        button_id5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(numbersystem.this, dectohex.class);
                startActivity(action);
            }
        });

        button_id6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(numbersystem.this, hextodec.class);
                startActivity(action);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbersystem);
        init();
    }
}


