package com.example.samplecalc.model;

import com.example.samplecalc.R;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Operation {
    PLUS(R.id.plusButton) {
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.add(y));
        }
    },
    MINUS(R.id.minusButton){
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.subtract(y));
        }
    },
    MULTI(R.id.multiButton){
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.multiply(y));
        }
    },
    DIV(R.id.divButton){
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.divide(y, 100, RoundingMode.HALF_UP));
        }
    };

    private int mResourceId;

    private Operation(int id) {
        mResourceId = id;
    }

    /**
     * @return id値
     */
    private int getId() {
        return mResourceId;
    }
    /**
     * id値からEnumを取得する
     *
     * @param id
     * @return
     */
    public static Operation getOperationById(int id) {
        for (Operation operation : Operation.values()) {
            if (operation.getId() == id) {
                return operation;
            }
        }
        return null;
    }


    public abstract BigDecimal eval(BigDecimal x, BigDecimal y);
}
