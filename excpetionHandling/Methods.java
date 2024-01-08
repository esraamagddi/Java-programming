package excpetionHandling;

class Methods {
    public static double divide(double numerator, double denominator) throws MyException{
        if (denominator == 0) {
            throw new MyException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

    public static double square(double number) throws MyException {
        if (number<0){
          throw new MyException("it must be positive");

        }
        return Math.pow(number, 2);
    }

    public static int difference(int num1, int num2)throws MyException {
        if(num1<num2)
        {
          throw new MyException("num1 must be bigger than num2");

        }
        return num1 - num2;
    }
}
