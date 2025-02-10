package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testHomework {

    @Test(description = "Проверка сложения двух чисел", testName = "Простой тест")
    public void simpleTest() {
        int a = 2;
        int b = 2;

        int sum = a + b;

        assertEquals(sum, 4, "Сумма должна быть 4");
    }

    // Параметризованный тест с DataProvider
    @DataProvider(name = "data")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { 1, 2, 3 },
                { 2, 3, 5 },
                { 3, 5, 8 },
                { 5, 5, 10 }
        };
    }

    @Test(dataProvider = "data", description = "Тест с использованием набора данных", testName = "Простой тест с набором данных")
    public void parameterizedTest(int a, int b, int expectedSum) {
        assertEquals(a + b, expectedSum, "Сумма должна совпадать с ожидаемым значением");
    }
}
