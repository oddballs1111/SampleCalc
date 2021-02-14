package com.example.samplecalc.model;

import com.example.samplecalc.controller.OnDisplayNumObserver;
import com.example.samplecalc.controller.state.State;

public interface InputContract {
    abstract public void InputNumber(String num);
    abstract public void InputOperation(Operation ope);
    abstract public void InputEqual();
    abstract public void InputAllClear();

    abstract public void setDisplayNumObserver(OnDisplayNumObserver observer);
}