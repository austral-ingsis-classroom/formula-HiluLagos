package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;

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
        return value.toString();
    }

    @Override
    public List<String> getVariables() {
        return List.of();
    }
}
