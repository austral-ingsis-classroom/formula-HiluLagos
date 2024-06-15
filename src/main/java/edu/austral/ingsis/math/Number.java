package edu.austral.ingsis.math;

import java.util.List;

public class Number implements Function {

    private final Double value;

    public Number(Double value) {
        this.value = value;
    }

    @Override
    public Double getResult() {
        return value;
    }

    @Override
    public String printFunction() {
        if (value == Math.floor(value)) {
            return String.valueOf(value.intValue());
        } else {
            return value.toString();
        }
    }

    @Override
    public List<String> getVariables() {
        return List.of();
    }
}
