package complex;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<ComplexNumber<?>> complexNumbers = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Enter the real part of Complex Number " + (i + 1) + ":");
                double real = scanner.nextDouble();
                System.out.println("Enter the imaginary part of Complex Number " + (i + 1) + ":");
                double imaginary = scanner.nextDouble();

                ComplexNumber<Double> complexNumber = new ComplexNumber<>(real, imaginary);
                complexNumbers.add(complexNumber);
                
            } catch (InputMismatchException e) {
                System.out.println(" enter valid numeric values.");
                System.exit(0);
            }
        }

        System.out.println("Complex Numbers: " + complexNumbers);

        ComplexNumber<Double> complex1 = new ComplexNumber<>(2.0, 3.0);
        ComplexNumber<Double> complex2 = new ComplexNumber<>(1.0, 2.0);
        
        ComplexNumber<Double> resultAdd = complex1.add(complex2);
        ComplexNumber<Double> resultSubtract = complex1.subtract(complex2);
        ComplexNumber<Double> resultMultiply = complex1.multiply(complex2);
        
       
        System.out.println("Result of Addition: " + resultAdd);
        System.out.println("Result of Subtraction: " + resultSubtract);
        System.out.println("Result of Multiplication: " + resultMultiply);

        scanner.close();
    }
}