package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;

import java.util.ArrayList;
import java.util.List;

public class SqRt implements Function{

    private final Function element;

    public SqRt(Function element) {
        this.element = element;
    }

    @Override
    public Double getResult() {
        return Math.sqrt(element.getResult());
    }

    @Override
    public String printFunction() {
        return "sqrt(" + element.printFunction() + ")";
    }

    @Override
    public List<String> getVariables() {
        return new ArrayList<>(element.getVariables());
    }
}
