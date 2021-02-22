package com.fsts.tpcalculmicda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.tv_result);

        String result = getIntent().getStringExtra("transfer_result");
        textView.setText(result);

    }
}