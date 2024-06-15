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
        String basePrint = isComplex(base) ? "(" + base.printFunction() + ")" : base.printFunction();
        String exponentPrint = isComplex(exponent) ? "(" + exponent.printFunction() + ")" : exponent.printFunction();
        return basePrint + " ^ " + exponentPrint;
    }

    @Override
    public List<String> getVariables() {
        List<String> result = new ArrayList<>(base.getVariables());
        result.addAll(exponent.getVariables());
        return result;
    }

    private boolean isComplex(Function function){
        return function instanceof Sum || function instanceof Div || function instanceof Mult || function instanceof Sub;
    }
}
