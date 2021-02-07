package com.example.samplecalc.controller;

import android.util.Log;

import com.example.samplecalc.controller.state.NumberAState;
import com.example.samplecalc.controller.state.State;
import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.InputContract;
import com.example.samplecalc.model.Operation;

public class CalcController implements InputContract {
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
        mState.InputNumber(num, mState);
    }

    @Override
    public void InputOperation(Operation ope) {
        Log.d(TAG, "InputOperation ope = " + ope);
        Log.d(TAG, "InputOperation mState = " + mState);
        mState.InputOperation(ope, mState);
    }

    @Override
    public void InputEqual() {
        Log.d(TAG, "InputEqual mState = " + mState);
        mState.InputEqual(mState);
    }

    public void changeState(State state) {
        mState = state;
    }
}
