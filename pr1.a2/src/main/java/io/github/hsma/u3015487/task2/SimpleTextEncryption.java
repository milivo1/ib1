package io.github.hsma.u3015487.task2;

import java.util.Scanner;

/**
 * Programm zur einfachen verschlüsselung von Text
 *
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
     * Die Methoden, die einen String in einem Rutsch in ein Array of Character und umgekehrt umwandeln, dürfen nicht verwendet werden.
     * -> new String(char[])
     * -> "Text".toCharArray()
     * -> StringBuilder.toString()
     *
     * @param text
     * @return
     */
    private static String encrypt(final String text) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            final char character = text.charAt(i);
            if (!Character.isLetter(character)) {
                encrypted += character;
                continue;
            }
            final int nextChar = character + 1;
            encrypted += (char)nextChar;
        }

        return encrypted;
    }
}
