package com.example.samplecalc.controller.state;

import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.Operation;
import com.example.samplecalc.model.StateContract;

public class OprationState extends BaseAllCelarState  {
    @Override
    public void InputNumber(String num, StateContract state, CalcModel calc) {
        //displayNumに数字を挿入
        calc.initialDisplayNum();
        //displayNumに数字を挿入
        calc.setmDisplayNum(num);
        //BigDecimalBに数字を挿入
        calc.setBigDecimalB();
        //displayNumを表示
        calc.showDisplayNum();

        //数字Bの状態に遷移
        state.changeState(new NumberBState());
    }

    @Override
    public void InputOperation(Operation ope, StateContract state, CalcModel calc) {
        //四則演算の代入
        calc.setOperation(ope);

    }

    @Override
    public void InputEqual(StateContract state, CalcModel calc) {
        //BigDecimalBに数字を挿入
        calc.setBigDecimalB();

        //四則演算の処理を実行
        calc.eval();

        //displayNumを表示
        calc.showDisplayNum();

        //BigDecimalAに数字を挿入
        calc.setBigDecimalA();

        //計算結果の状態に遷移
        state.changeState(new ResultState());
    }
}
