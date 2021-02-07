package com.example.samplecalc.model;

import java.math.BigDecimal;

public enum Operation {
    PLUS {
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.add(y));
        }
    },
    MINUS{
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.subtract(y));
        }
    },
    MULTI{
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.multiply(y));
        }
    },
    DIV{
        public BigDecimal eval(BigDecimal x, BigDecimal y) {
            return (x.divide(y));
        }
    };

    public abstract BigDecimal eval(BigDecimal x, BigDecimal y);
}
