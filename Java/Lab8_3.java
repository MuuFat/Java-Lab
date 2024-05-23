class Converter {
    double cmInch(double cm) {
        return cm * 0.393701;
    }
    double inchCm(double inch) {
        return inch * 2.54;
    }
    double zlotyEuro(double zloty) {
        return zloty * 0.22;
    }
    double euroZloty(double euro) {
        return euro * 4.55;
    }
    double celsiusFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    double fahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
public class Lab8_3 {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("100 centimeter = " + converter.cmInch(100) + " inch");
        System.out.println("50 inch = " + converter.inchCm(50) + " centimeter");
        System.out.println("1000 Zloty = " + converter.zlotyEuro(1000) + " Euro");
        System.out.println("500 Euro = " + converter.euroZloty(500) + " Zloty");
        System.out.println("50 Celsius = " + converter.celsiusFahrenheit(50) + " Fahrenheit");
        System.out.println("100 Fahrenheit = " + converter.fahrenheitCelsius(100) + " Celsius");
    }
}

