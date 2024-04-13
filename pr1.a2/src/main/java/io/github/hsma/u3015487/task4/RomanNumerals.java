package io.github.hsma.u3015487.task4;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Programm zur Umwandlung von Ganzzahlen zu römischen Zahlen
 * Größtmögliche, darstellbare Zahl ist 3999 -> MMMCMXCIX;
 */
public class RomanNumerals {
    static final int[] romanDecimals = new int[13];
    static final String[] romanNumerals = new String[13];

    static {
        //Initialisieren des Arrays mit den notwendigen Kombinationen, abgeleitet aus den Anforderungen.
        romanDecimals[0] = 1000; romanNumerals[0] = "M";
        romanDecimals[1] = 900; romanNumerals[1] = "CM"; // mögliche Subtraktion
        romanDecimals[2] = 500; romanNumerals[2] = "D";
        romanDecimals[3] = 400; romanNumerals[3] = "CD"; // mögliche Subtraktion
        romanDecimals[4] = 100; romanNumerals[4] = "C";
        romanDecimals[5] = 90; romanNumerals[5] = "XC"; // mögliche Subtraktion
        romanDecimals[6] = 50; romanNumerals[6] = "L";
        romanDecimals[7] = 40; romanNumerals[7] = "XL"; // mögliche Subtraktion
        romanDecimals[8] = 10; romanNumerals[8] = "X";
        romanDecimals[9] = 9; romanNumerals[9] = "IX"; // mögliche Subtraktion
        romanDecimals[10] = 5; romanNumerals[10] = "V";
        romanDecimals[11] = 4; romanNumerals[11] = "IV"; // mögliche Subtraktion
        romanDecimals[12] = 1; romanNumerals[12] = "I";
    }

    public static void main(String[] args) {

        try (final Scanner in = new Scanner(System.in)) {
            System.out.println("Bitte eine Ganzzahl zwischen 1 und 3999 eingeben:");
            final int userNumber = in.nextInt();

            // Fehler wenn die eingegebene Zahl nicht in range ist
            if (userNumber < 1 || userNumber > 3999) {
                throw new RuntimeException("Zahl musst zwischen 1 und 3999 liegen");
            }

            final String romanNumeral = toRomanNumeral(userNumber);
            final String romanNumeral2 = toRomanNumeral2(userNumber);

            System.out.println("Römische Zahl: " + romanNumeral);
            System.out.println("Römische Zahl: " + romanNumeral2);
            System.out.println("Tschüss!");
        }
    }

    /**
     * Alternative Vorgehensweise durch einfache Ersetzungen
     *
     * @param number
     * @return
     */
    static String toRomanNumeral2(final int number) {
        // Bildet die Zahl erstmal als eine Reihe von römischen einsen ab. 5 wird also zu IIIII
        final String numbersAsString = IntStream.range(0, number)
                .mapToObj(ignored ->  "I")
                .collect(Collectors.joining());
        /**
         * Ersetzt die Zahlen nacheinander:
         * - erstmal die einstelligen Grundzahlen und Zwischenzahlen von der kleinsten zur größten
         * - wendet anschließend rückärts die Grund/Zwischenzahl Kombinationen aus die subtrahiert werden können
         */
        return numbersAsString
                .replaceAll("IIIII", "V") // ersetzen durch 5
                .replaceAll("VV", "X") // ersetzen durch 10
                .replaceAll("XXXXX", "L") // ersetzen durch 50
                .replaceAll("LL", "C") // ersetzen durch 100
                .replaceAll("CCCCC", "D") // ersetzen durch 500
                .replaceAll("DD", "M") // ersetzen durch 1000
                .replaceAll("DCCCC", "CM") // ersetzen durch 900
                .replaceAll("CCCC", "CD") // ersetzen durch 400
                .replaceAll("LXXXX", "XC") // ersetzen durch 90
                .replaceAll("XXXX", "XL") // ersetzen durch 40
                .replaceAll("VIIII", "IX") // ersetzen durch 9
                .replaceAll("IIII", "IV") // ersetzen durch 4
                ;
    }

    /**
     * Ermittlung der römischen Zahl durch wiederholtes subtrahieren des nahestehendsten dezimalen Äquivalents mit Hilfe von Rekursion
     *
     * @param number
     * @return
     */
    static String toRomanNumeral(final int number) {
        final int floorIndex =  floorIndex(number);
        final int romanDecimal = romanDecimals[floorIndex];
        final String romanNumeral = romanNumerals[floorIndex];

        if ( number == romanDecimal) {
            return romanNumeral;
        }
        return romanNumerals[floorIndex] + toRomanNumeral((number-romanDecimal));
    }

    /**
     * Ermittel den Index der nächsten Zahl, die kleiner oder gleich der übergebenen Zahl ist
     * @param number
     * @return array index
     */
    static int floorIndex(final int number) {
        for (int i = 0; i < romanDecimals.length; i++) {
            final int decimal = romanDecimals[i];
            if (decimal <= number) {
                return i;
            }
        }
        throw new IllegalStateException("algo scheint nicht zu stimmen");
    }
}
