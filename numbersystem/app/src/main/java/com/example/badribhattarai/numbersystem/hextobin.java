package com.example.badribhattarai.numbersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hextobin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hextobin);

        Button calc = findViewById(R.id.Calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText hex = findViewById(R.id.button_hex);
                TextView bin = findViewById(R.id.button_binary);
                String num = hex.getText().toString();
                String result=hextobinary(num);
                bin.setText(result);
            }
        });

        Button rst = findViewById(R.id.reset);
        rst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText bin = findViewById(R.id.button_binary);
                TextView hex = findViewById(R.id.button_hex);
                bin.setText("");
                hex.setText("");
            }
        });

        Button swap=findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(hextobin.this, bintohex.class);
                startActivity(action);
            }
        });

    }

    public String hextobinary(String num)
    {
        hextodec conv=new hextodec();
        dectobinary binary=new dectobinary();

        int result=conv.hextodec(num);
        String conversion=binary.dectobinary(result);

        return conversion;
    }
}
