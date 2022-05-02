import Calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class TestCalc {
    Calculator calc = Calculator.instance.get();
    private static long startTime;
    private  long testStartTime;

    @BeforeAll
    static void initAll() {
        System.out.println("Running calculator test");
        startTime = System.nanoTime();
    }

    @BeforeEach
    void init() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @org.junit.jupiter.api.Test
    public void testPlus() {
        // given:
        final int x = 10;
        final int y = 15;

        // when:

        final int a = calc.plus.apply(x, y);

        // then:
        Assertions.assertEquals(x + y, a);
    }

    @Test
    @DisplayName("Test minus")
    public void testMinus() {
        // given:
        final int x = 10;
        final int y = 15;

        // when:
        final int a = calc.minus.apply(x, y);

        // then:
        Assertions.assertEquals(x - y, a);
    }

    @Test
    @DisplayName("Divide with negative number")
    public void testDevide() {
        // given:
        final int x = 10;
        final int y = -1;

        // when:
        final int a = calc.devide.apply(x, y);

        // then:
        Assertions.assertTrue(a<0);
    }

    @Test
    @DisplayName("Divide Should not throw an exception")

    void shouldNotThrowException() {
        final int a = calc.devide.apply(5, 0);
        assertDoesNotThrow(() -> {});
    }

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void tearDownAll() {
    }


}
