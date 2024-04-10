package io.github.hsma.u3015487.task2;

import java.util.Scanner;

/**
 * Programm zur einfachen verschlüsselung von Text
 */
public class SimpleTextEncryption {

    public static void main(String[] args) {
        try (final Scanner in = new Scanner(System.in)) {
            System.out.println("Bitte beliebigen Text zum verschlüsseln eingeben:");
            final String userInput = in.nextLine();
            final String encryptedUserInput = encrypt(userInput);
            System.out.println("Verschlüsselter Text: " + encryptedUserInput);
        }
    }

    /**
     * "Verschlüsselt" den Text indem jeder Buchstabe um eine Stelle (A->B) verschoben wird
     *
     * @param text
     * @return
     */
    private static String encrypt(final String text) {
        final StringBuilder builder = new StringBuilder();
        for (final char ch : text.toCharArray()) {
            // überspringe alle Zeichen die kein Buchstaben repräsentieren
            if (!Character.isLetter(ch)) {
                builder.append(ch);
                continue;
            }
            final int nextChar = ch + 1;
            builder.append((char) nextChar);
        }
        return builder.toString();
    }
}
