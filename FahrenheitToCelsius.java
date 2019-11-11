import java.util.Scanner;
public class FahrenheitToCelsius{
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    double input,celsius;
    System.out.print("Enter Temperature In Fahrenheit: ");
    input = x.nextDouble();
    celsius = (input-32) * 5/9;
    System.out.println("F: " + input +"\nC:" + celsius);
    }
}