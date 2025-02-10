package junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class testHomework {

    @DisplayName("Проверка сложения двух чисел")
    @Test
    public void simpleTest() {
        int a = 2;
        int b = 2;

        int sum = a + b;

        Assertions.assertEquals(sum, 4, "Сумма должна быть 4");
    }
    static Object[][] data(){
        return new Object[][] {
                { 1, 2, 3 },
                { 2, 3, 5 },
                { 3, 5, 8 },
                { 5, 5, 10 }
        };
    }


    @ParameterizedTest
    @MethodSource("data")
    @DisplayName("Проверка сложения параметризованных чисел")
    void parameterizedTest(int a, int b, int expectedSum) {
        Assertions.assertEquals(expectedSum, a + b, "Сумма должна совпадать с ожидаемым значением");
    }
}
