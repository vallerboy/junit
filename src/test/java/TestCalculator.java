import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by OskarPraca on 2017-04-10.
 */
public class TestCalculator {
    @Test
    public void testDivide() {
         Main main = new Main();
        assertEquals("Wynikiem powinno być 2", 2,  main.divide(10, 5), 0);
        assertEquals("Wynikiem powinno być 5", 5,  main.divide(15, 3), 0);
    }

    @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals("Wynikiem powinno być 15", 15,  main.add(10, 5), 0);
        assertEquals("Wynikiem powinno być 18", 18,  main.add(15, 3), 0);
    }
}
