package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.operations.Div;
import edu.austral.ingsis.math.operations.Mod;
import edu.austral.ingsis.math.operations.Mult;
import edu.austral.ingsis.math.operations.Pow;
import edu.austral.ingsis.math.operations.Sub;
import edu.austral.ingsis.math.operations.Sum;
import org.junit.jupiter.api.Test;

public class ResolutionWithVariablesTest {

  // Pasar valores de variables a una funsion con variables y resolverla

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {
    Function func1 = new Sum(new Number(1d), new Variable("x", 3d));

    final Double result = func1.getResult();

    assertThat(result, equalTo(4d));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    Function func2 = new Div(new Number(12d), new Variable("div", 4d));

    final Double result = func2.getResult();

    assertThat(result, equalTo(3d));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    Function func3 =
        new Mult(new Div(new Number(9d), new Variable("x", 3d)), new Variable("y", 4d));

    final Double result = func3.getResult();

    assertThat(result, equalTo(12d));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    Function func4 =
        new Pow(new Div(new Number(27d), new Variable("a", 9d)), new Variable("b", 3d));

    final Double result = func4.getResult();

    assertThat(result, equalTo(27d));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    Function func5 = new Pow(new Variable("z", 36d), new Div(new Number(1d), new Number(2d)));

    final Double result = func5.getResult();

    assertThat(result, equalTo(6d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    Function func6 = new Sub(new Mod(new Variable("value", 8d)), new Number(8d));

    final Double result = func6.getResult();

    assertThat(result, equalTo(0d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    Function func7 = new Sub(new Mod(new Variable("value", 8d)), new Number(8d));

    final Double result = func7.getResult();

    assertThat(result, equalTo(0d));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    Function func8 = new Mult(new Sub(new Number(5d), new Variable("i", 2d)), new Number(8d));

    final Double result = func8.getResult();

    assertThat(result, equalTo(24d));
  }
}
