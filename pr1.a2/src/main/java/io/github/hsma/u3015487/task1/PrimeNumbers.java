package io.github.hsma.u3015487.task1;

import java.util.Scanner;

/**
 * Programm zur Berechnung von Primzahlen
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        try (final Scanner in = new Scanner(System.in)) {
            System.out.println("Bitte eine positive Ganzzahl eingeben zur Berechnung der Primzahlen:");
            final int number = in.nextInt();
            findPrimes(number);
            System.out.println("Tschüss!");
        }
    }

    /**
     * Geben Sie alle Primzahlen aus, die kleiner oder gleich dieser eingelesenen Zahl sind.
     *
     * @param n
     */
    public static void findPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println("Primzahl gefunden: " + i);
            }
        }
    }

    /**
     * In einer Folge ganzer Zahlen > 1 wird jede einzelne daraufhin untersucht,
     * ob sie durch (mindestens) eine Zahl, die kleiner ist als sie selbst, ganzzahlig teilbar ist.
     *
     * @param n
     * @return ob die Zahl eine Primzahl ist
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        // Existiert keine solche Zahl, dann handelt es sich um eine Primzahl
        return true;
    }
}
