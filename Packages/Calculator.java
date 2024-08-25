package Packages;

import java.util.Scanner;

public class Calculator {
    public static float result;

    public static void ergebnisZurücksetzen() {
        Calculator.result = 0;
    }

    public static float summe(float a, float b) {
        Calculator.ergebnisZurücksetzen();
        return Calculator.result = a + b;
    }

    public static float differenz(float a, float b) {
        Calculator.ergebnisZurücksetzen();
        return Calculator.result = a - b;
    }

    public static float eingabePrüfen(Scanner scanner) {
        boolean validInput = false;
        float input = 0;

        while (!validInput) {
            try {
                input = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Geben Sie eine gültige Zahl ein:");
            }
        }
        return input;
    }

    public static float quadratGleichungRechnen (float a) {
        float output = 0;
        output = (float) (3 * Math.pow(a, 2) - 8 * a + 4);
        return output;
    }
}
