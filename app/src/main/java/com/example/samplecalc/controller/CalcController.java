package com.example.samplecalc.controller;

import android.util.Log;

import com.example.samplecalc.controller.state.NumberAState;
import com.example.samplecalc.controller.state.State;
import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.InputContract;
import com.example.samplecalc.model.Operation;
import com.example.samplecalc.model.StateContract;

public class CalcController implements InputContract, StateContract {
    private State mState;
    private CalcModel mCalcModel;
    private final String TAG = "CalcController";

    public CalcController() {
        mState = new NumberAState();
        mCalcModel = new CalcModel();
    }
    @Override
    public void InputNumber(String num) {
        Log.d(TAG, "InputNumber num = " + num);
        Log.d(TAG, "InputNumber mState = " + mState);
        mState.InputNumber(num, this, mCalcModel);
    }

    @Override
    public void InputOperation(Operation ope) {
        Log.d(TAG, "InputOperation ope = " + ope);
        Log.d(TAG, "InputOperation mState = " + mState);
        mState.InputOperation(ope, this, mCalcModel);
    }

    @Override
    public void InputEqual() {
        Log.d(TAG, "InputEqual mState = " + mState);
        mState.InputEqual(this, mCalcModel);
    }

    @Override
    public void InputAllClear() {
        Log.d(TAG, "InputEqual mState = " + mState);
        mState.InputAllClear(this, mCalcModel);
    }

    @Override
    public void setDisplayNumObserver(OnDisplayNumObserver observer) {
        mCalcModel.setOnDisplayObserver(observer);
    }

    @Override
    public void changeState(State state) {
        mState = state;
    }
}
