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

public class PrintTest {

  // Este test printea la funcion en un string

  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {
    final String expected = "1 + 6";

    Function func1 = new Sum(new Number(1d), new Number(6d));

    final String result = func1.printFunction();

    assertThat(result, equalTo(expected));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {
    final String expected = "12 / 2";

    Function func2 = new Div(new Number(12d), new Number(2d));

    final String result = func2.printFunction();

    assertThat(result, equalTo(expected));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {
    final String expected = "(9 / 2) * 3";

    Function func3 = new Mult(new Div(new Number(9d), new Number(2d)), new Number(3d));

    final String result = func3.printFunction();

    assertThat(result, equalTo(expected));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    final String expected = "(27 / 6) ^ 2";

    Function func4 = new Pow(new Div(new Number(27d), new Number(6d)), new Number(2d));

    final String result = func4.printFunction();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {
    final String expected = "|value| - 8";

    Function func4 = new Sub(new Mod(new Variable("value", 0)), new Number(8d));

    final String result = func4.printFunction();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {
    final String expected = "|value| - 8";

    Function func5 = new Sub(new Mod(new Variable("value", 0)), new Number(8d));

    final String result = func5.printFunction();

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    final String expected = "(5 - i) * 8";

    Function func6 = new Mult(new Sub(new Number(5d), new Variable("i", 0)), new Number(8d));

    final String result = func6.printFunction();

    assertThat(result, equalTo(expected));
  }
}
