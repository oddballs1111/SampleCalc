package com.example.samplecalc.controller.state;

import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.StateContract;

public abstract class BaseAllClearState implements State {
    @Override
    public void InputAllClear(StateContract state, CalcModel calc) {
        //CalcModelの初期化
        calc.initialize();

        //Displayに表示
        calc.showDisplayNum();

        //Stateの初期化
        state.changeState(new NumberAState());
    }
}
