package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editTextNumber;
private Button button;
private TextView textView3;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        textView19=findViewById(R.id.textView19);
        textView20=findViewById(R.id.textView20);
        textView21=findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);
        textView23=findViewById(R.id.textView23);
        textView24=findViewById(R.id.textView24);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editTextNumber.getText().toString();
                int num=Integer.parseInt(s);
                textView24.setText(num+ " x "+"1"+" = "+num*1 );
                textView23.setText(num+ " x "+"2"+" = "+num*2 );
                textView22.setText(num+ " x "+"3"+" = "+num*3 );
                textView21.setText(num+ " x "+"4"+" = "+num*4 );
                textView20.setText(num+ " x "+"5"+" = "+num*5 );
                textView19.setText(num+ " x "+"6"+" = "+num*6 );
                textView18.setText(num+ " x "+"7"+" = "+num*7 );
                textView17.setText(num+ " x "+"8"+" = "+num*8 );
                textView16.setText(num+ " x "+"9"+" = "+num*9 );
                textView15.setText(num+ " x "+"10"+" = "+num*10 );
            }
        });
    }
}