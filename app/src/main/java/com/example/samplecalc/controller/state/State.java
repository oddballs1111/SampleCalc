package com.example.samplecalc.controller.state;

import com.example.samplecalc.model.CalcModel;
import com.example.samplecalc.model.Operation;
import com.example.samplecalc.model.StateContract;

public interface State {
  abstract public void InputNumber(String num, StateContract state, CalcModel calc);
  abstract public void InputOperation(Operation ope, StateContract state, CalcModel calc);
  abstract public void InputEqual(StateContract state, CalcModel calc);
  abstract public void InputAllClear(StateContract state, CalcModel calc);
}
