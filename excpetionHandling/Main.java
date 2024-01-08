package excpetionHandling;

public class Main{
    public static void main(String[] args) {
        try {
            double result = Methods.divide(10.0, 0);
            System.out.println("Division result: " + result);

        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }


    }
}