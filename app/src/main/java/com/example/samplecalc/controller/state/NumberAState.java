package com.example.samplecalc.controller.state;

import android.util.Log;

import com.example.samplecalc.model.Operation;

public class NumberAState implements State {
    private final String TAG = "NumberAState";
    @Override
    public void InputNumber(String num, State state) {
        //TODO 数字を押下された処理
        Log.d(TAG, "InputNumber : num = " + num + ", state = " + state);
    }

    @Override
    public void InputOperation(Operation ope, State state) {
        //TODO 四則演算を押下された処理
        Log.d(TAG, "InputOperation : ope = " + ope + ", state = " + state);
    }

    @Override
    public void InputEqual(State state) {
        //TODO イコールを押下された処理
        Log.d(TAG, "InputEqual : state = " + state);
    }
}
