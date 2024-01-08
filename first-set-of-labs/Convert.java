@FunctionalInterface
interface TemperatureConvert {
    double convert(double celsius);
}

public class Convert {
    public static void main(String[] args) {

        TemperatureConvert celsiusToFahrenheit = celsius -> (celsius * 9 / 5) + 32;


        double celsiusTemp = 27;
        double fahrenheitTemp = celsiusToFahrenheit.convert(celsiusTemp);

        System.out.println(celsiusTemp + " degrees Celsius is equal to " + fahrenheitTemp + " degrees Fahrenheit.");
    }
}