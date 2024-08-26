package Packages;

import java.util.Scanner;

public class Kreisrechner {
    public double pi = Math.PI;
    public double radius;

    public Kreisrechner (double radius) {
        this.radius = radius;
    }

    public double flächeRechnen () {
        return this.pi * Math.pow(this.radius, 2); 
    }

    public double umfangRechnen () {
        return 2 * this.pi * this.radius;
    }

    public void ergebnisAufDemBildschirmAusgeben() {
        System.out.println(String.format(
                "Fläche: %.7f\nUmfang: %.7f",
                this.flächeRechnen(),
                this.umfangRechnen()));
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
