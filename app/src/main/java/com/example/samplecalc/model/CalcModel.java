package com.example.samplecalc.model;

import android.util.Log;

import com.example.samplecalc.controller.OnDisplayNumObserver;

import java.math.BigDecimal;

public class CalcModel {
    private final String TAG = "CalcModel";
    private BigDecimal mNumA;
    private BigDecimal mNumB;
    private String mDisplalNum;
    private Operation mOpe;
    private OnDisplayNumObserver mObserver;

    private final String INITIAL_NUM = "0";

    public CalcModel(){
        mDisplalNum = INITIAL_NUM;
        mOpe = Operation.PLUS;
        mNumA = new BigDecimal(INITIAL_NUM);
        mNumB = new BigDecimal(INITIAL_NUM);
    }

    public void setmDisplayNum(String num) {
        if(mDisplalNum == null || mDisplalNum.equals(INITIAL_NUM)) {
            mDisplalNum = num;
        } else {
            mDisplalNum += num;
        }
        Log.d(TAG, "num = " + num + ",mDisplayNum = " + mDisplalNum);
    }

    public void setBigDecimalA() {
        mNumA = new BigDecimal(mDisplalNum);
        Log.d(TAG, "mNumA = " + mNumA);
    }

    public void setBigDecimalB() {
        mNumB = new BigDecimal(mDisplalNum);
        Log.d(TAG, "mNumB = " + mNumB);
    }

    public void setOperation(Operation ope) {
        mOpe = ope;
        Log.d(TAG, "mOpe = " + mOpe);
    }

    public void setOnDisplayObserver(OnDisplayNumObserver observer) {
        mObserver = observer;
    }

    public void initialDisplayNum() {
        mDisplalNum = INITIAL_NUM;
    }

    public void initialize() {
        mDisplalNum = INITIAL_NUM;
        mOpe = Operation.PLUS;
        mNumA = new BigDecimal(INITIAL_NUM);
        mNumB = new BigDecimal(INITIAL_NUM);
    }

    public void showDisplayNum() {
        Log.d(TAG, "mDisplayNum = " + mDisplalNum);
        Log.d(TAG, "mObserver = " + mObserver);
        mObserver.onChange(mDisplalNum);
    }

    public void eval() {
        BigDecimal result = new BigDecimal(INITIAL_NUM);
        try {
            result = mOpe.eval(mNumA,mNumB);

        } catch (ArithmeticException e) {
            //do nothing
        }
        mDisplalNum = result.stripTrailingZeros().toPlainString();
    }
}
