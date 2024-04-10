# pr1.a2.1

Primzahlen können wie folgt berechnet werden:

- In einer Folge ganzer Zahlen > 1 wird jede einzelne daraufhin untersucht, ob sie durch
  (mindestens) eine Zahl, die kleiner ist als sie selbst, ganzzahlig teilbar ist.
- Existiert keine solche Zahl, dann handelt es sich um eine Primzahl, ansonsten nicht.
  Überlegen Sie sich anhand eines Aktivitätsdiagramms eine Implementierung (ohne Arrays!) für
  diesen Algorithmus und setzen diesen unter Eclipse als Java-Programm um:
- Lesen Sie eine ganze Zahl von der Console ein. Geben Sie dazu eine
  Eingabeaufforderung aus und lesen Sie eine Zahl ein.
- Geben Sie alle Primzahlen aus, die kleiner oder gleich dieser eingelesenen Zahl sind.

**Anmerkung:**

Die Primzahlen sollen nicht gespeichert, sondern nur ausgegeben werden.
Weiterhin spielt es keine Rolle, ob die Primzahlen ab- oder aufsteigend abgegeben werden.

# pr2.a2.2

Gesucht ist ein einfacher Verschlüsselungsalgorithmus: In einer Zeichenkette wird jeder
Buchstabe durch seinen Nachfolger ersetzt: A → B, B → C, C → D, …, Y → Z, Z → A. Alle
anderen Zeichen bleiben unverändert, deutsche Umlaute brauchen ebenfalls nicht
berücksichtigt werden. Genauso soll die Groß-, Kleinschreibung der Worte sich nicht ändern.
So wird aus "Julius Caesar" die Zeichenkette "Kvmjvt Dbftbs". Die Methoden, die einen String in
einem Rutsch in ein Array of Character und umgekehrt umwandeln, dürfen nicht verwendet
werden.

Entwickeln Sie zuerst ein Aktivitätsdiagramm und dann unter Eclipse ein Java-Programm für
diesen Algorithmus.

# pr2.a2.3

Implementieren Sie die als „Sieb des Eratosthenes“ bekannte Primzahlberechnung mit Hilfe
eines Arrays. Das Array repräsentiert alle ganzen Zahlen bis zu einer maximalen Zahl n (die
von der Console eingelesen wird!). Nun werden nacheinander alle Vielfachen aller Zahlen, die
kleiner als n/2 sind, im Array markiert. Diejenigen Zahlen im Array, die danach noch keine Mar-
kierung tragen, sind die Primzahlen. Für diese Aufgabe ist die Verwendung von Multiplikation
und Division im gesamten Quelcode untersagt.

Entwickeln Sie zuerst ein Aktivitätsdiagramm und dann unter Eclipse ein Java-Programm für
diesen Algorithmus.

**Anmerkung:**

Orientieren Sie sich bei der Lösung dieser Aufgabe nicht an der Aufgabe 1 dieser
Pflichtübung! Entwickeln Sie das Programm neu und überlegen Sie sich eine geeignete Größe
für das Array.

# pr1.a2.4

Die Darstellung von Dezimalzahlen als „römische Zahlen“ wird durch folgende Regeln definiert:

- Es gibt die Grundzahlen I, X, C und M mit den Bedeutungen 1, 10, 100 und 1000.
  Außerdem gibt es die Zwischenzahlen V, L und D mit den Bedeutungen 5, 50, und 500.
- Gleiche Grundzahlen direkt nebeneinander werden addiert, dabei dürfen höchstens drei
  gleiche Grundzahlen nebeneinander stehen.
- Gleiche Zwischenzahlen dürfen nicht addiert werden bzw. nicht nebeneinander stehen.
- Kleinere Grundzahlen rechts von größeren werden addiert – links von größeren subtra-
  hiert. die Grundzahlen I, X, und C dürfen nur von der nächst höheren Zwischen- bzw.
  Grundzahl subtrahiert werden. Beispiel: I darf nur von V oder X subtrahiert werden.
- Zwischenzahlen dürfen nicht subtrahiert werden.

Welches ist die größte nach diesen Regeln darstellbare Zahl m? Was fällt Ihnen auf, wenn Sie
an eine Analoguhr mit römischem Zifferblatt denken?

Entwickeln Sie zuerst ein Aktivitätsdiagramm und dann unter Eclipse ein Java-Programm, dass
die Eingabe einer Dezimalzahl 1 ≤ x ≤ m ermöglicht und als römische Zahl ausgibt. Zahlen au-
ßerhalb dieses Bereiches sollen zur Fehlermeldung führen.