package edu.austral.ingsis.math.operations;
import edu.austral.ingsis.math.Function;

import java.util.ArrayList;
import java.util.List;

public class Sum implements Function {

    private final Function left;
    private final Function right;

    public Sum(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Double getResult() {
        return left.getResult() + right.getResult();
    }

    @Override
    public String printFunction() {
        return left.printFunction() + " + " + right.printFunction();
    }

    @Override
    public List<String> getVariables() {
        List<String> result = new ArrayList<>(left.getVariables());
        result.addAll(right.getVariables());
        return result;
    }
}
