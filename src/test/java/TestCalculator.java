import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by OskarPraca on 2017-04-10.
 */
public class TestCalculator {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // ta metoda wywoła się tylko raz, przed wszystkimi testami
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // ta metoda wywoła się tylko raz, po wszystkich testach
    }

    @Before
    public void setUp() throws Exception {
        // metoda która wywoła się przed każdym testem
    }

    @After
    public void tearDown() throws Exception {
        // ta metoda pójdzie po kazdym wykonanym teście
    }

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
