package io.github.hsma.u3015487.task4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Programm zur Umwandlung von Ganzzahlen zu römischen Zahlen
 * Größtmögliche, darstellbare Zahl ist 3999 -> MMMCMXCIX;
 */
public class RomanNumerals {

    public static void main(String[] args) {
        // Sortierte Map mit mapping von Zahl zu Römischer Zahl
        // inklusive aller möglichen Subtraktionen
        final Map<Integer, String> romanNumerals = new LinkedHashMap<>();
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM"); // mögliche Subtraktion
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD"); // mögliche Subtraktion
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC"); // mögliche Subtraktion
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL"); // mögliche Subtraktion
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX"); // mögliche Subtraktion
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV"); // mögliche Subtraktion
        romanNumerals.put(1, "I");

        try (final Scanner in = new Scanner(System.in)) {
            System.out.println("Bitte eine Ganzzahl zwischen 1 und 3999 eingeben:");
            final int userNumber = in.nextInt();

            // Fehler wenn die eingegebene Zahl nicht in range ist
            if (userNumber < 1 || userNumber > 3999) {
                throw new RuntimeException("Zahl musst zwischen 1 und 3999 liegen");
            }

            // Ergebnis römische Zahl
            final StringBuilder romanNumeral = new StringBuilder();
            int reducingNumber = userNumber;

            // Iteriert absteigend über die definierten Zahlen
            for (final int number : romanNumerals.keySet()) {
                final String romanLiteral = romanNumerals.get(number);
                // Wenn die aktuelle Zahl der Zahl aus der Map entspricht, sind wir fertig
                if (reducingNumber == number) {
                    romanNumeral.append(romanLiteral);
                    break;
                }
                // Subtrahieren solange es aufgeht
                while (isPositive(reducingNumber - number)) {
                    reducingNumber -= number;
                    romanNumeral.append(romanLiteral);
                }
            }

            System.out.println("Römische Zahl: " + romanNumeral);
            System.out.println("Tschüss!");
        }
    }

    /**
     * Ermittelt ob die übergebene Zahle positiv ist
     *
     * @param number
     * @return
     */
    private static boolean isPositive(final int number) {
        return number > 0;
    }
}
