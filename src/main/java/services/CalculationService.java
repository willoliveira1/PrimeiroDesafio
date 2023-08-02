package main.java.services;

public class CalculationService implements ICalculationService {

    public int sumOfAllMultiples(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int sumOfEvenFibonacciNumbers(int number) {
        int lastNumber = 0;
        int currentNumber = 1;
        int result;
        int sum = 0;

        while (currentNumber <= number) {
            result = lastNumber + currentNumber;
            lastNumber = currentNumber;
            currentNumber = result;

            if (result % 2 == 0) {
                sum += result;
            }
        }
        return sum;
    }

    public int largestPrime(Long number) {
        int result = 0;

        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                number /= i;
                result = i;
            }
        }
        return result;
    }

    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
