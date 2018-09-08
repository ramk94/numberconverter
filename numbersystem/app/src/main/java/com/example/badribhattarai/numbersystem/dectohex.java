package com.example.badribhattarai.numbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dectohex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dectohex);

        Button calc = findViewById(R.id.Calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText dec = findViewById(R.id.button_decimal);
                TextView hex = findViewById(R.id.button_hex);
                int num = Integer.parseInt(dec.getText().toString());
                String hexresult;
                hexresult = dectohex(num);
                hex.setText(hexresult);
            }
        });

        Button rst = findViewById(R.id.reset);
        rst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText dec = findViewById(R.id.button_decimal);
                TextView hex = findViewById(R.id.button_hex);
                dec.setText("");
                hex.setText("");
            }
        });

        Button swap=findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(dectohex.this, hextodec.class);
                startActivity(action);
            }
        });
    }

    //Convert binary to hex
    public String dectohex(int num) {
        int rem;
        String hexnum = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            rem = num % 16;
            hexnum =hex[rem]+hexnum;
            num = num / 16;
            Log.d("Result","Calculated Hex is"+hexnum);
        }
        return hexnum;
    }
}
