public class ProgramClass
{
    //Function to find number is Prime(True) or not(False)
    public boolean primeNumberFunction(int number)
    {
        if (number % 2 == 0)
        {
            //Its not PrimeNumber
            return false;
        }
        else
        {
            int limit = number / 2;
            for (int x = 3; x < limit; x++)
            {
                if (number % x == 0)
                {
                    //its NotPrimeNumber
                    return false;
                }
            }
            //Its PrimeNumber
            return true;
        }
    }

    //Function to find number is Even(True) or Odd(False)
    public boolean evenOddFunction(int number)
    {
        boolean cond = false;
        if (number % 2 == 0)
        {
            //Its Even
            cond = true;
        }
        return cond;
    }

    //Function to find average of integer array
    public int arrayAverageFunction(int[] numberArray)
    {
        int length = numberArray.length;
        int arraySum = 0;

        for (int x = 0; x < length; x++)
        {
            arraySum += numberArray[x];
        }

        return (arraySum / length);
    }

    //Function to convert celsius to fahrenheit and kelvin
    public double[] celsiusToFahrenheitKelvin(double celsiusTemperature)
    {
        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;
        double kelvinTemperature = celsiusTemperature + 273.15;

        return new double[]{fahrenheitTemperature, kelvinTemperature};
    }

    public boolean stringPalindromeFunction(String stringvalue)
    {
        stringvalue = stringvalue.toLowerCase();
        String reversedString = new String(new StringBuilder(stringvalue).reverse());
        boolean cond = false;
        if (reversedString.equals(stringvalue))
        {
            cond = true;
        }
        return cond;
    }
}
