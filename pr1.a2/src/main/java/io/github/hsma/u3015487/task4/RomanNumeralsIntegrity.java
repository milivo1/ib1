package io.github.hsma.u3015487.task4;

public class RomanNumeralsIntegrity {

    /**
     * Testet ob beide Algorithmen das gleiche Ergebnis liefern.
     * Wirft einen Fehler, wenn die Ergebnisse voneinander abweichen.
     */

    public static void main(String[] args) {
        for (int i = 1; i < 4000; i++) {
            final String romanNumeral = RomanNumerals.toRomanNumeral(i);
            final String romanNumeral2 = RomanNumerals.toRomanNumeral2(i);
            System.out.println("Römische Zahl: " + romanNumeral);
            System.out.println("Römische Zahl: " + romanNumeral2);
            System.out.println("-----------------------------------");

            if (!romanNumeral.equals(romanNumeral2)) {
                throw new IllegalStateException("Ungleichheit bei " + i);
            }
        }
    }
}
