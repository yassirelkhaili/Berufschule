import java.util.Scanner;

public class Temperatur {

    public double temperaturUmrechnen(double celcius) {
        return (double) 9 / 5 * celcius + 32;
    }

    public double eingabePrüfen(Scanner scanner) {
        boolean validInput = false;
        double input = 0;

        while (!validInput) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Geben Sie eine gültige Zahl ein:");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        double celcius = 0;
        double fahrenheit = 0;

        System.out.println("Die Temperatur in Celcius eingeben:");
        Scanner scanner = new Scanner(System.in);
        Temperatur temp = new Temperatur();
        celcius = temp.eingabePrüfen(scanner);
        fahrenheit = temp.temperaturUmrechnen(celcius);
        System.out.println("Temperatur in °Celsius: " + celcius);
        System.out.print(celcius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit");
    }
}
