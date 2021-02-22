package com.fsts.tpcalculmicda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText op1,op2;
    TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        mTvResult = findViewById(R.id.text_result);
    }

    public double firstInput(){
        return Double.parseDouble(op1.getText().toString());
    }

    public double secondInput(){
        return Double.parseDouble(op2.getText().toString());
    }

    public void btn_addition(View v){
        mTvResult.setText(String.valueOf(firstInput() + secondInput()));
    }
    public void btn_multiplication(View v){
        mTvResult.setText(String.valueOf(firstInput() * secondInput()));
    }
    public void btn_subtraction(View v){
        mTvResult.setText(String.valueOf(firstInput() - secondInput()));
    }

    public void transfer(View v){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("transfer_result",mTvResult.getText().toString());
        startActivity(intent);
    }

}