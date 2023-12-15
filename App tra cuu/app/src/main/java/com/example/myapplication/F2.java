package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class F2 extends AppCompatActivity {
    public static String keyF2 = "TYPE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f2);

        findViewById(R.id.F2btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(F2.this, F1.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.F2btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFrame3(0);
            }
        });
        findViewById(R.id.F2btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFrame3(1);
            }
        });
        findViewById(R.id.F2btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFrame3(2);
            }
        });
    }
    void nextFrame3(int value){
        Intent intent = new Intent(F2.this, MainActivity.class);
        intent.putExtra(keyF2, value);
        startActivity(intent);
    }
}