package edu.austral.ingsis.math;

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

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    final List<String> result = Collections.emptyList();
    // Yo tengo que poner la operacion vista en verde en este test
    // Usando mi motor implementado uso la funcion para generar un resultado
    // Y comparo el resultado con el esperado
    // No tengo que parsear sintaxis, solo programaticamente generar el evaluador de funciones
    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction7() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("i"));
  }
}
