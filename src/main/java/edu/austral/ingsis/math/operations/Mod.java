package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;

import java.util.ArrayList;
import java.util.List;

public class Mod implements Function {

    private final Function element;

    public Mod(Function element) {
        this.element = element;
    }


    @Override
    public Double getResult() {
        return Math.abs(element.getResult());
    }

    @Override
    public String printFunction() {
        return "|" + element.printFunction() + "|";
    }

    @Override
    public List<String> getVariables() {
        return new ArrayList<>(element.getVariables());
    }
}
