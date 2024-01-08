package Package2;

// import Package2.QuadraticRootCalculator;

// @FunctionalInterface
// interface QuadraticRootCalculator {
//     Double calculateRoot(Double x);
// }

public class Equation {

    public static QuadraticRootCalculator calculateRoots(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        QuadraticRootCalculator quadraticRoots;
        QuadraticRootCalculator quadraticRoots2;

        if (discriminant >= 0) {
            // Root calculation
            quadraticRoots = x -> (-b + Math.sqrt(discriminant)) / (2 * a);
            quadraticRoots2 = x -> (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display roots
            double root1 = quadraticRoots.calculateRoot(a);
            double root2 = quadraticRoots2.calculateRoot(a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

            return quadraticRoots;
        } else {
            System.out.println("No real number.");
            return null;
        }
    }
}



///3classes-> 1-excpetion 2-main(try-catch-final) 3-methods[divison-squr-diff]uses expection class
//lab2-genarics---> baseclass shape
//wildcards
