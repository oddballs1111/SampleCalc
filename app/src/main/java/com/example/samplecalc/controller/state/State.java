package com.example.samplecalc.controller.state;

import com.example.samplecalc.model.Operation;

public interface State {
  abstract public void InputNumber(String num, State state);
  abstract public void InputOperation(Operation ope, State state);
  abstract public void InputEqual(State state);
}
