package com.example.samplecalc.model;

import com.example.samplecalc.controller.state.State;

public interface StateContract {
    abstract public void changeState(State state);
}
