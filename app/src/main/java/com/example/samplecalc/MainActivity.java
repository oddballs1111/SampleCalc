package com.example.samplecalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.samplecalc.controller.CalcController;
import com.example.samplecalc.controller.OnDisplayNumObserver;
import com.example.samplecalc.databinding.ConstraintCalcBinding;
import com.example.samplecalc.model.InputContract;
import com.example.samplecalc.model.Operation;

public class MainActivity extends AppCompatActivity implements OnDisplayNumObserver {
    private final String TAG = "MainActivity";
    private InputContract mContract;
    private ConstraintCalcBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        mBinding = ConstraintCalcBinding.inflate(getLayoutInflater());
//        View view = mBinding.getRoot();
//        setContentView(view);

//        setContentView(R.layout.constraint_calc);
        mBinding = DataBindingUtil.setContentView(this, R.layout.constraint_calc);
        mContract = new CalcController();
        mContract.setDisplayNumObserver(this);
        mBinding.setHandler(mContract);

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
    public void onChange(String num) {
        //Displayの表示更新を行う
        mBinding.displayNum.setText(num);
    }
}
