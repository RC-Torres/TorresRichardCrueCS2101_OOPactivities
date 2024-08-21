import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float celsius = scanner.nextFloat();
        scanner.close();
        float fahrenheit = celsiusToFahreinheit(celsius);
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
    }
    public static float celsiusToFahreinheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
}