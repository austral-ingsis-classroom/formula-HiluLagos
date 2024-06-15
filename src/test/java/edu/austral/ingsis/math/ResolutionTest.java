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

public class ResolutionTest {

  // Este test evalua una funcion sin variables y retorna el resultado esperado

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    Function func1 = new Sum(new Number(1d), new Number(6d));

    final Double result = func1.getResult();

    assertThat(result, equalTo(7d));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {
    Function func2 = new Div(new Number(12d), new Number(2d));

    final Double result = func2.getResult();

    assertThat(result, equalTo(6d));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {
    Function func3 = new Mult(new Div(new Number(9d), new Number(2d)), new Number(3d));

    final Double result = func3.getResult();

    assertThat(result, equalTo(13.5d));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {
    Function func4 = new Pow(new Div(new Number(27d), new Number(6d)), new Number(2d));

    final Double result = func4.getResult();

    assertThat(result, equalTo(20.25d));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {
    Function func5 = new Pow(new Number(36d), new Div(new Number(1d), new Number(2d)));

    final Double result = func5.getResult();

    assertThat(result, equalTo(6d));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
    Function func6 = new Mod(new Number(136d));

    final Double result = func6.getResult();

    assertThat(result, equalTo(136d));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {
    Function func7 = new Mod(new Number(-136d));

    final Double result = func7.getResult();

    assertThat(result, equalTo(136d));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {
    Function func8 = new Mult(new Sub(new Number(5d), new Number(5d)), new Number(8d));

    final Double result = func8.getResult();

    assertThat(result, equalTo(0d));
  }
}
