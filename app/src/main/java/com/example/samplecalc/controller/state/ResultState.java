package com.example.samplecalc.controller.state;

import com.example.samplecalc.model.Operation;

public class ResultState implements State {
    @Override
    public void InputNumber(String num, State state) {
        //TODO 数字を押下された処理
    }

    @Override
    public void InputOperation(Operation ope, State state) {
        //TODO 四則演算を押下された処理

    }

    @Override
    public void InputEqual(State state) {
        //TODO イコールを押下された処理

    }
}
