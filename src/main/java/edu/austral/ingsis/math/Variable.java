package edu.austral.ingsis.math;

import java.util.List;

public class Variable implements Function {

  private final String stringValue;
  private final double numericalValue;

  public Variable(String value, double number) {
    this.stringValue = value;
    this.numericalValue = number;
  }

  @Override
  public Double getResult() {
    return numericalValue;
  }

  @Override
  public String printFunction() {
    return stringValue;
  }

  @Override
  public List<String> getVariables() {
    return List.of(stringValue);
  }
}
