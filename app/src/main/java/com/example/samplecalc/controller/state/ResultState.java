package com.example.samplecalc.controller.state;

import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.Operation;
import com.example.samplecalc.model.StateContract;

public class ResultState extends BaseAllClearState {
    @Override
    public void InputNumber(String num, StateContract state, CalcModel calc) {
        //displayNumに数字を挿入
        calc.initialDisplayNum();
        //displayNumに数字を挿入
        calc.setmDisplayNum(num);
        //BigDecimalAに数字を挿入
        calc.setBigDecimalA();
        //displayNumを表示
        calc.showDisplayNum();

        //数字Aの状態に遷移
        state.changeState(new NumberAState());
    }

    @Override
    public void InputOperation(Operation ope, StateContract state, CalcModel calc) {
        //四則演算を挿入
        calc.setOperation(ope);

        //四則演算状態に遷移
        state.changeState(new OprationState());

    }

    @Override
    public void InputEqual(StateContract state, CalcModel calc) {
        //四則演算の処理を実行
        calc.eval();

        //displayNumを表示
        calc.showDisplayNum();

        //BigDecimalAに数字を挿入
        calc.setBigDecimalA();

    }
}
