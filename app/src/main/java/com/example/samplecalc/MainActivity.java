package com.example.samplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_calc);

        Operation ope = Operation.PLUS;
        Log.d(TAG, "ope = " + ope);
        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));

        ope = Operation.MINUS;
        Log.d(TAG, "ope = " + ope);
        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));

        ope = Operation.MULTI;
        Log.d(TAG, "ope = " + ope);
        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));

        ope = Operation.DIV;
        Log.d(TAG, "ope = " + ope);
        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}
