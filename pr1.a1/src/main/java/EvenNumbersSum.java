import java.util.Scanner;

public class EvenNumbersSum {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int userInput = 0, countNumbers = 0, sumEvenNumbers = 0;

        do {
            System.out.println("Bitte gib eine beliebige, positive Ganzzahl ein (negativ für Abbruch): ");
            userInput = scanner.nextInt();

            // Berechnung für letzte Ausführung ignorieren
            if (userInput >= 0) {
                countNumbers++;
                if (userInput % 2 == 0) {
                    sumEvenNumbers += userInput;
                }
            }

        } while (userInput >= 0);

        System.out.printf("Es wurden insgesamt %s Zahlen eingegeben. Die Summe aller geraden Zahlen ist %s%n", countNumbers, sumEvenNumbers);
    }
}
