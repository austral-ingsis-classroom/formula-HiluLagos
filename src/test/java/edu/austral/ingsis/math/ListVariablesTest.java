package edu.austral.ingsis.math;

import edu.austral.ingsis.math.operations.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import java.util.Collections;
import java.util.List;

public class ListVariablesTest {


  // Estos tests usan una funcion para buscar de mi funcion las variables
  // En el caso devuelve vacio porque no hay, y en el segundo devuelve div porque es la unica variable
  // En caso de haber muchas da una lista con todas las variables

  // Yo tengo que poner la operacion vista en verde en este test
  // Usando mi motor implementado uso la funcion para generar un resultado
  // Y comparo el resultado con el esperado
  // No tengo que parsear sintaxis, solo programaticamente generar el evaluador de funciones


  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    Function func1 = new Sum(new Number(1d), new Number(6d));

    final List<String> result = func1.getVariables();

    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    Function func2 = new Div(new Number(12d), new Variable("div", 0d));

    final List<String> result = func2.getVariables();

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    Function func3 = new Sum(new Div(new Number(9d), new Variable("x", 0d)), new Variable("y", 0d));

    final List<String> result = func3.getVariables();

    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    Function func4 = new Pow(new Div(new Number(27d), new Variable("a", 0d)), new Variable("b", 0d));

    final List<String> result = func4.getVariables();

    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    Function func5 = new Pow(new Variable("z", 0d), new Div(new Number(1d), new Number(2d)));

    final List<String> result = func5.getVariables();

    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    Function func5 = new Sub(new Mod(new Variable("value", 0)), new Number(8d));

    final List<String> result = func5.getVariables();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction7() {
    Function func6 = new Sub(new Mod(new Variable("value", 0)), new Number(8d));

    final List<String> result = func6.getVariables();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    Function func7 = new Mult(new Sub(new Number(5d), new Variable("i", 0)), new Number(8d));

    final List<String> result = func7.getVariables();

    assertThat(result, containsInAnyOrder("i"));
  }
}
