package Packages;

import java.util.Scanner;

public class Tankstelle {
    public double umsatzSteuer = 12.825;
    public double nettoPreisjeLiter = 1.50;
    public double getankteLiter;

    public Tankstelle(double getankteLiter) {
        this.getankteLiter = getankteLiter;
    }

    public double bruttoBeitragRechnen() {
        return this.nettoBeitragRechnen() + this.umsatzSteuer;
    }

    public double nettoBeitragRechnen() {
        return getankteLiter * nettoPreisjeLiter;
    }

    public void ergebnisAufDemBildschirmAusgeben() {
        System.out.println(String.format(
                "Nettopreis je Liter in EUR: %.2f\nNettobetrag: %.2f\nUmsatzsteuer: %.3f\nBruttobetrag: %.3f",
                this.nettoPreisjeLiter,
                this.nettoBeitragRechnen(),
                this.umsatzSteuer,
                this.bruttoBeitragRechnen()));
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
