package com.example.badribhattarai.numbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BINTODEC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bintodec);

        Button calc = findViewById(R.id.Calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText bin = findViewById(R.id.button_binary);
                TextView dec = findViewById(R.id.button_decimal);
                int num = Integer.parseInt(bin.getText().toString());
                int binaryresult;
                binaryresult = BintoDec(num);
                dec.setText(String.valueOf(binaryresult));
            }
        });

        Button rst = findViewById(R.id.reset);
        rst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText bin=findViewById(R.id.button_binary);
                TextView dec = findViewById(R.id.button_decimal);
                bin.setText("");
                dec.setText("");
            }
        });

        Button swap=findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(BINTODEC.this, dectobinary.class);
                startActivity(action);
            }
        });
    }

    public int BintoDec(int num)
    {
        int counter=0;
        int result=0;

        while(num!=0)
        {
            int temp=num%10;
            result+=temp*Math.pow(2,counter);
            num=num/10;
            ++counter;
        }

        return result;
    }
}
