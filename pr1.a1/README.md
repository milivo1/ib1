# pr1.a1.1
Basierend auf dem Beispielprogramm Celsius.java aus der Vorlesung und der ersten
Übungsstunde entwickeln Sie unter der Kommandozeile ein Java Programm zur Umrechnung
von Fahrenheit in Celsius. Die Umrechnung soll sich so lange wiederholen, bis eine 1 als
Eingabe übergeben wird. Achten Sie auf geeignete Klassen- und Variablennamen.
Neben Sie so wenig Veränderungen am Ursprungsquelltext Celsius.java wie möglich vor.
Die Verwendung von ==, !=, ||, |, && und & (Gleichheit, Ungleichheit, Und, Oder) ist für diesen
Quellcode komplett untersagt!

## artefacts:

- `Fahrenheit.java`

## manual compilation

- `javac -d out src/main/java/io/github/hsma/u3015487/Fahrenheit.java`
- `java -cp out io.github.hsma.u3015487.Fahrenheit`

# pr1.a1.2
Gegeben sei die folgende Aufgabe: Lassen Sie den Benutzer ganze Zahlen (int) über die
Tastatur eingeben. Alle geraden Zahlen, die der Benutzer eingibt, sollen aufsummiert werden.
Die erste negative Zahl (< 0) beendet die Eingabe. Lassen Sie dann die Gesamtsumme und die
Anzahl aller eingegeben Zahlen ausgeben. Die letzte Zahl soll dabei nicht mit berücksichtigt
werden.
Entwickeln Sie zuerst ein Aktivitätsdiagramm und dann unter der Kommandozeile ein Java-
Programm, dass die obige Aufgabenstellung realisiert.

## artefacts:

- `EvenNumbersSum.java`
- `src/main/resources/pr1.a1.2.drawio`
- `src/main/resources/pr1.a1.2.svg`

## manual compilation

- `javac -d out src/main/java/io/github/hsma/u3015487/EvenNumbersSum.java`
- `java -cp out io.github.hsma.u3015487.EvenNumbersSum`