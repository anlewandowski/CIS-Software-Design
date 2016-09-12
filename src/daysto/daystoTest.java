/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysto;
import daysto.daysto;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author tue97761
 */
public class daystoTest {
  @Test
  public void evaluatesExpression() {
    int test1 = Math.abs(new daysto().daysuntil(2016,9,26,2016,9,25));
    assertEquals(test1,1);
    int test2 = Math.abs(new daysto().daysuntil(2016,10,5,2015,4,3));
    assertEquals(test2,552);
    int test3 = Math.abs(new daysto().daysuntil(2014,2,3,2013,5,3));
    assertEquals(test3,26);
  }
}
