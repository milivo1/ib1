package io.github.hsma.u3015487.task4;

import java.util.Scanner;

/**
 * Programm zur Umwandlung von Ganzzahlen zu römischen Zahlen
 * Größtmögliche, darstellbare Zahl ist 3999 -> MMMCMXCIX;
 */
public class RomanNumerals {

    public static void main(String[] args) {
        final int[] romanDecimals = new int[13];
        final String[] romanNumerals = new String[13];

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


        try (final Scanner in = new Scanner(System.in)) {
            System.out.println("Bitte eine Ganzzahl zwischen 1 und 3999 eingeben:");
            final int userNumber = in.nextInt();

            // Fehler wenn die eingegebene Zahl nicht in range ist
            if (userNumber < 1 || userNumber > 3999) {
                throw new RuntimeException("Zahl musst zwischen 1 und 3999 liegen");
            }

            final String romanNumeral = toRomanNumeral(userNumber, romanDecimals, romanNumerals);

            System.out.println("Römische Zahl: " + romanNumeral);
            System.out.println("Tschüss!");
        }
    }

    /**
     * Ermittlung der römischen Zahl durch wiederholtes subtrahieren des nahestehendsten dezimalen Äquivalents mit Hilfe von Rekursion
     *
     * @param number
     * @param decimals
     * @param numerals
     * @return
     */
    private static String toRomanNumeral(final int number, final int[] decimals, final String[] numerals) {
        final int floorIndex =  floorNumberIndex(number, decimals);
        final int romanDecimal = decimals[floorIndex];
        final String romanNumeral = numerals[floorIndex];

        if ( number == romanDecimal) {
            return romanNumeral;
        }
        return numerals[floorIndex] + toRomanNumeral((number-romanDecimal), decimals, numerals);
    }

    /**
     * Ermittel den Index der nächsten Zahl, die kleiner oder gleich der übergebenen Zahl ist
     * @param number
     * @return array index
     */
    private static int floorNumberIndex(final int number, final int[] decimals) {
        for (int i = 0; i < decimals.length; i++) {
            final int decimal = decimals[i];
            if (decimal <= number) {
                return i;
            }
        }
        throw new IllegalStateException("algo scheint nicht zu stimmen");
    }
}
