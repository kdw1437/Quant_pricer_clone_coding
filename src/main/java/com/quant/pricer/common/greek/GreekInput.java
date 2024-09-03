package com.quant.pricer.common.greek;


import com.quant.pricer.common.input.CalculationInput;

public class GreekInput {

    private String key;

    private CalculationInput input;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CalculationInput getInput() {
        return input;
    }

    public void setInput(CalculationInput input) {
        this.input = input;
    }
}
