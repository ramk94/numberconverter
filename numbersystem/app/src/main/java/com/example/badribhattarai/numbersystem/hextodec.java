package com.example.badribhattarai.numbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hextodec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hextodec);

        Button calc = findViewById(R.id.Calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText hex = findViewById(R.id.button_hex);
                TextView dec = findViewById(R.id.button_decimal);
                String num = hex.getText().toString();
                int decresult=hextodec(num);
                Log.d("Result","Calculated decimal is"+decresult);
                dec.setText(String.valueOf(decresult));
            }
        });

        Button rst = findViewById(R.id.reset);
        rst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText hex = findViewById(R.id.button_hex);
                TextView dec = findViewById(R.id.button_decimal);
                dec.setText("");
                hex.setText("");
            }
        });

        Button swap=findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(hextodec.this, dectohex.class);
                startActivity(action);
            }
        });
    }

    //Convert hex to decimal
    public int hextodec(String num) {
        int value=0;
        num=num.toUpperCase();
        String hexnum = "";
        String hex= "0123456789ABCDEF";
        for(int i=0;i<num.length();++i) {
            char c=num.charAt(i);
            int d=hex.indexOf(c);
            value=value*16+d;

            Log.d("Result","Calculated decimal is"+value);
        }
        return value;
    }
}
