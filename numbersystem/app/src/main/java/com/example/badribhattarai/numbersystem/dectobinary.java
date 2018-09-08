package com.example.badribhattarai.numbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dectobinary extends AppCompatActivity {

    private String binarynum="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dectobinary);
        Button calc = findViewById(R.id.Calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText dec = findViewById(R.id.button_decimal);
                TextView bin = findViewById(R.id.button_binary);
                int num = Integer.parseInt(dec.getText().toString());
                String binaryresult;
                binaryresult = dectobinary(num);
                bin.setText(binaryresult);
            }
    });

        Button rst = findViewById(R.id.reset);
        rst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText dec=findViewById(R.id.button_decimal);
                TextView bin = findViewById(R.id.button_binary);
                bin.setText("");
                dec.setText("");
            }
        });

        Button swap=findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(dectobinary.this, BINTODEC.class);
                startActivity(action);
            }
        });
}

    public String dectobinary(int num)
    {
        int counter=0;
        binarynum="";
        while(num>0)
        {
            binarynum=(num%2)+binarynum;
            num=num/2;
            ++counter;
        }
        return binarynum;
    }
}

