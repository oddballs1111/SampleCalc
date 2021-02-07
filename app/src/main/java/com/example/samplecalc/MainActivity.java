package com.example.samplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.samplecalc.controller.CalcController;
import com.example.samplecalc.model.InputContract;
import com.example.samplecalc.model.Operation;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = "MainActivity";
    private InputContract mContract;

    private View.OnClickListener mOnClickListener = new View.OnClickListener(){
        public void onClick(View v) {
            int id = v.getId();
            switch(id) {
                case R.id.twoButton:
                    Log.d(TAG, "onClick : twoButton");
                    break;

                case R.id.threeButton:
                    Log.d(TAG, "onClick : threeButton");
                    break;

                case R.id.fourButton:
                    Log.d(TAG, "onClick : fourButton");
                    break;
                default:
                    /* do nothing */
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_calc);
        mContract = new CalcController();

//        Operation ope = Operation.PLUS;
//        Log.d(TAG, "ope = " + ope);
//        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));
//
//        ope = Operation.MINUS;
//        Log.d(TAG, "ope = " + ope);
//        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));
//
//        ope = Operation.MULTI;
//        Log.d(TAG, "ope = " + ope);
//        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));
//
//        ope = Operation.DIV;
//        Log.d(TAG, "ope = " + ope);
//        Log.d(TAG, "eval(1,2) = " + ope.eval(new BigDecimal("1"),new BigDecimal("2")));
//        Log.d(TAG, "onCreate");
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

//        Button zeroButton = (Button) findViewById(R.id.zeroButton);
//        zeroButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Log.d(TAG, "onClick : zeroButton");
//            }
//        });
//
//        Button oneButton = (Button) findViewById(R.id.oneButton);
//        oneButton.setOnClickListener(view -> {
//            Log.d(TAG, "onClick : oneButton");
//        });
//
//        Button twoButton = (Button) findViewById(R.id.twoButton);
//        twoButton.setOnClickListener(mOnClickListener);
//        Button threeButton = (Button) findViewById(R.id.threeButton);
//        threeButton.setOnClickListener(mOnClickListener);
//        Button fourButton = (Button) findViewById(R.id.fourButton);
//        fourButton.setOnClickListener(mOnClickListener);
//
//        Button fiveButton = (Button) findViewById(R.id.fiveButton);
//        fiveButton.setOnClickListener(this);
//        Button sixButton = (Button) findViewById(R.id.sixButton);
//        sixButton.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id) {
            case R.id.fiveButton:
            case R.id.sixButton:
            case R.id.sevenButton:
                Log.d(TAG, "onClick : button : " + ((Button)v).getText());
                break;
            default:
                /* do nothing */
        }
    }

    public void sendMessage(View view) {
        int id = view.getId();
        switch(id) {
            case R.id.zeroButton:
            case R.id.twoButton:
            case R.id.threeButton:
            case R.id.fourButton:
            case R.id.fiveButton:
            case R.id.sixButton:
            case R.id.sevenButton:
            case R.id.eightButton:
            case R.id.nineButton:
                Log.d(TAG, "sendMessage : numberButton : " + ((Button)view).getText());
                mContract.InputNumber(((Button)view).getText().toString());
                break;

            case R.id.plusButton:
            case R.id.minusButton:
            case R.id.multiButton:
            case R.id.divButton:
                Log.d(TAG, "sendMessage : oparationButton : " + ((Button)view).getText());
                mContract.InputOperation(Operation.PLUS);
                break;

            case R.id.equalButton:
                Log.d(TAG, "sendMessage : equalButton : " + ((Button)view).getText());
                mContract.InputEqual();
                break;
            default:
                /* do nothing */
        }
    }
}
