package com.example.samplecalc.controller.state;

import android.util.Log;

import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.Operation;
import com.example.samplecalc.model.StateContract;

public class NumberAState extends BaseAllClearState {
    private final String TAG = "NumberAState";
    @Override
    public void InputNumber(String num, StateContract state, CalcModel calc) {
        Log.d(TAG, "InputNumber : num = " + num + ", state = " + state);

        //displayNumに数字を挿入
        calc.setmDisplayNum(num);
        //BigDecimalAに数字を挿入
        calc.setBigDecimalA();
        //displayNumを表示
        calc.showDisplayNum();

    }

    @Override
    public void InputOperation(Operation ope, StateContract state, CalcModel calc) {
        Log.d(TAG, "InputOperation : ope = " + ope + ", state = " + state);

        //四則演算を挿入
        calc.setOperation(ope);

        //四則演算状態に遷移
        state.changeState(new OprationState());
    }

    @Override
    public void InputEqual(StateContract state, CalcModel calc) {
        Log.d(TAG, "InputEqual : state = " + state);

        //計算結果の状態に遷移
        state.changeState(new ResultState());
    }

}
