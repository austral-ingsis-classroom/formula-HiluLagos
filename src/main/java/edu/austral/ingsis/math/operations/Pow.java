package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;

import java.util.ArrayList;
import java.util.List;

public class Pow implements Function{

    private final Function base;
    private final Function exponent;

    public Pow(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public Double getResult() {
        return Math.pow(base.getResult(), exponent.getResult());
    }

    @Override
    public String printFunction() {
        return base.printFunction() + "^" + exponent.printFunction();
    }

    @Override
    public List<String> getVariables() {
        return new ArrayList<>(base.getVariables());
    }
}
