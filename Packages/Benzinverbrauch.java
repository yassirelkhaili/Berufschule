package Packages;

import java.util.Scanner;

public class Benzinverbrauch {
    public double verbrauchPro100Km = 42;
    public double gefahreneKilometer;

    public Benzinverbrauch(double gefahreneKilometer) {
        this.gefahreneKilometer = gefahreneKilometer;
    }

    public double verbrauchtesBenzin() {
        return (this.verbrauchPro100Km / this.gefahreneKilometer) * 100;
    }

    public void ergebnisAufDemBildschirmAusgeben() {
        System.out.println(String.format(
                "Verbrauchtes Benzin in Liter: %.2f\nSie haben auf 100 km %.15f Liter verbraucht",
                this.verbrauchPro100Km,
                this.verbrauchtesBenzin()));
    }

    public static double eingabePrüfen(Scanner scanner) {
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
}
