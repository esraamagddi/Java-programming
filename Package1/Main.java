package Package1;

import Package2.Equation;
import Package2.QuadraticRootCalculator;

public class Main  {

    public static void main(String[] args) {
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        QuadraticRootCalculator quadraticRootsFunction = Equation.calculateRoots(a, b, c);

        double x = 1.0;
        double quadraticRoot = quadraticRootsFunction.calculateRoot(x);

        System.out.println("For x=" + x + ", Quadratic Root: " + quadraticRoot);
    }
}
