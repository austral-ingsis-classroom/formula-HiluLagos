package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.Variable;

import java.util.ArrayList;
import java.util.List;

public class Mult implements Function {

    private final Function left;
    private final Function right;

    public Mult(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Double getResult() {
        return left.getResult() * right.getResult();
    }

    @Override
    public String printFunction() {
        String leftStr = isComplex(left) ? "(" + left.printFunction() + ")" : left.printFunction();
        String rightStr = isComplex(right) ? "(" + right.printFunction() + ")" : right.printFunction();
        return leftStr + " * " + rightStr;
    }

    @Override
    public List<String> getVariables() {
        List<String> result = new ArrayList<>(left.getVariables());
        result.addAll(right.getVariables());
        return result;
    }

    private boolean isComplex(Function function){
        return function instanceof Sum || function instanceof Div || function instanceof Mult || function instanceof Sub;
    }
}
