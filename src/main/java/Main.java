package main.java;

import main.java.services.ICalculationService;
import main.java.services.CalculationService;

public class Main {
    public static void main(String[] args) {
        ICalculationService service = new CalculationService();

        // Problem One
        int sumOfAllMultiples = service.sumOfAllMultiples(1000);
        System.out.println(sumOfAllMultiples);

        // Problem Two
        int sumOfEvenFibonacciNumbers = service.sumOfEvenFibonacciNumbers(4613732);
        System.out.println(sumOfEvenFibonacciNumbers);

        // Problem Three
        long findLargestPrime = service.largestPrime(600851475143l);
        System.out.println(findLargestPrime);
    }
}
