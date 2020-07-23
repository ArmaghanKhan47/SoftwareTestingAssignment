import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramClassTest {

    ProgramClass obj;
    public ProgramClassTest() {
        obj = new ProgramClass();
    }

    @Test
    void primeNumberFunctionTest()
    {
        int inputValue = 5;
        boolean expectedResult = true;
        boolean actualResult = this.obj.primeNumberFunction(inputValue);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void primeNumberFunctionTest2()
    {
        int inputValue = 6;
        boolean expectedResult = false;
        boolean actualResult = this.obj.primeNumberFunction(inputValue);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void evenOddFunctionTest()
    {
        int inputValue = 2;
        boolean expectedResult = true;
        boolean actualResult = this.obj.evenOddFunction(inputValue);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void evenOddFunctionTest2()
    {
        int inputValue = 3;
        boolean expectedResult = false;
        boolean actualResult = this.obj.evenOddFunction(inputValue);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void arrayAverageFunctionTest()
    {
        int[] inputArray = {1, 2, 3};
        int expectedResult = 2;
        int actualResult = this.obj.arrayAverageFunction(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void arrayAverageFunctionTest2()
    {
        int[] inputValue = {500, 500, 500};
        int expectedValue = 500;
        int actualResult = this.obj.arrayAverageFunction(inputValue);
        assertEquals(expectedValue, actualResult);
    }

    @Test
    void celsiusToFahrenheitKelvinTest()
    {
        double celsiusDegree = 0.0;
        double[] expectedValue = {32.0, 273.15};
        double[] actualValue = this.obj.celsiusToFahrenheitKelvin(celsiusDegree);
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void celsiusToFahrenheitKelvinTest2()
    {
        double celsiusDegree = 100.0;
        double[] expectedValue = {212.0, 373.15};
        double[] actualValue = this.obj.celsiusToFahrenheitKelvin(celsiusDegree);
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void stringPalindromeFunctionTest()
    {
        String inputValue = "racecar";
        boolean expectedValue = true;
        boolean actualValue = this.obj.stringPalindromeFunction(inputValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void stringPalindromeFunctionTest2()
    {
        String inputValue = "car";
        boolean expectedValue = false;
        boolean actualValue = this.obj.stringPalindromeFunction(inputValue);
        assertEquals(expectedValue, actualValue);
    }
}