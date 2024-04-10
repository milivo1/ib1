package io.github.hsma.u3015487.task3;

import java.util.Scanner;

/**
 * Programm zur Primzahlberechnung gemäß "Sieb des Eratosthenes"
 */
public class PrimeNumbersArray {

    public static void main(String[] args) {
        try (final Scanner in = new Scanner(System.in)) {
            System.out.println("Bitte eine positive Ganzzahl eingeben zur Berechnung der Primzahlen:");
            final int number = in.nextInt();
            final boolean[] primeNumbers = new boolean[number + 1];

            initializePrimeNumbers(number, primeNumbers);
            markPrimeNumbers(number, primeNumbers);
            printPrimes(primeNumbers);

            System.out.println("Tschüss!");
        }
    }

    /**
     * Markiert alle vielfachen der jeweiligen Zahl als nicht-Primzahl (false)
     *
     * @param number
     * @param primeNumbers
     */
    private static void markPrimeNumbers(final int number, final boolean[] primeNumbers) {
        for (int i = 2; i <= number; i++) {
            if (!primeNumbers[i]) {
                continue;
            }
            for (int j = i + i; j <= number; j = j + i) {
                primeNumbers[j] = false;
            }
        }
    }

    /**
     * Initialisiert alle Array-Felder außer 0 und 1 mit true
     *
     * @param number
     * @param primeNumbers
     */
    private static void initializePrimeNumbers(final int number, final boolean[] primeNumbers) {
        for (int i = 0; i <= number; i++) {
            primeNumbers[i] = i > 1;
        }
    }

    /**
     * Gibt alle (markierten) Primzahlen in die Konsole aus
     *
     * @param primeNumbers
     */
    private static void printPrimes(final boolean[] primeNumbers) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i]) {
                System.out.println("Primzahl: " + i);
            }
        }
    }
}
