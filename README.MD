# Bewertungsschema für die Programmieraufgabe

**Gesamtpunktzahl: 10 Punkte**

## Ziel der Aufgabe

Die Studierenden sollen eine Android-App mit Jetpack Compose entwickeln, die folgende Funktionen
beinhaltet:

- **Verwendung von DateTimePicker und Kalenderkomponenten.**
- **Ergänzung des bereitgestellten Codegerüsts.**
- **Implementierung spezifischer Funktionen gemäß den Anforderungen.**

**Bereitgestellte Ressourcen:**

- **Codegerüst:**
    - Navigation ist bereits implementiert.
    - Leere Composables für die Anzeige.
    - Leere `BookingEntry`-Klasse.

---

## Bewertungskriterien und Punkteverteilung

### 1. `BookingEntry.kt` (0,75 Punkte)

- **Korrekte Implementierung der Datenklasse** (0,75 Punkte)

    - Attribute:
        - `arrivalDate` (0,25 Punkte): `LocalDate` oder entsprechender Typ zur Speicherung des
          Ankunftsdatums.
        - `departureDate` (0,25 Punkte): `LocalDate` oder entsprechender Typ zur Speicherung des
          Abreisedatums.
        - `name` (0,25 Punkte): `String` zur Speicherung des Namens der Buchung.

### 2. `AddScreen.kt` (4,5 Punkte)

- **Implementierung des `DateRangePickerModal`** (2,5 Punkte)

    - **Methode für den Dialog implementieren** (1 Punkte): Die Studierenden sollen die
      Methode `DateRangePickerModal` erstellen, die den Dialog zur Datumsauswahl anzeigt.
    - **Logik zur Anzeige des Dialogs implementieren** (0,75 Punkte): Korrekte Integration des
      Dialogs in den `AddScreen`, sodass der Dialog beim Klick auf das entsprechende Feld geöffnet
      wird.
    - **Konvertierung der ausgewählten Long-Werte in `LocalDate`** (0,75 Punkte): Nach Auswahl eines
      gültigen Zeitraums sollen die erhaltenen `Long`-Werte korrekt in `LocalDate` umgewandelt und
      in den entsprechenden Variablen gespeichert werden.

    - **Save-Button Funktionalität:**

      - **Error Handling** (1 Punkte): Implementierung von Fehlermeldungen oder Validierungen, wenn
        der Name nicht eingegeben wurde oder kein gültiges Datum ausgewählt wurde.
        - **Erstellen und Speichern des `BookingEntry`-Objekts** (1 Punkte): Bei korrekten Eingaben soll
          ein neues `BookingEntry`-Objekt erstellt und im `SharedViewModel` gespeichert werden.

- **Save-Button Funktionalität** (2 Punkte)

    - Error Handling bei fehlendem Namen oder ungültigem Datum (1 Punkte)
    - Erstellen und Speichern eines neuen `BookingEntry`-Objekts im `SharedViewModel`, wenn die
      Eingaben korrekt sind (1 Punkte)

### 3. `HomeScreen.kt` (3 Punkte)

- **Anzeige der Buchungseinträge** (1,5 Punkte)

    - **Verwendung von `LazyColumn`** (0,75 Punkte): Die Studierenden sollen die Buchungseinträge
      mithilfe einer `LazyColumn` anzeigen, wenn die Liste `bookingsEntries` nicht leer ist.
    - **Anzeige bei leerer Liste** (0,75 Punkte): Wenn keine Buchungseinträge vorhanden sind, soll
      eine entsprechende Nachricht angezeigt werden.

- **`BookingEntryItem` Composable** (1,5 Punkte)

    - **Anzeige des Namens** (0,75 Punkte): Jeder Buchungseintrag soll den Namen korrekt anzeigen.
    - **Anzeige des Datums im richtigen Format** (0,75 Punkte): Die Ankunfts- und Abreisedaten sollen
      im Format `dd.MM.yyyy` angezeigt werden.

### 4. `SharedViewModel.kt` (1,5 Punkte)

- **`addBookingEntry`-Methode implementieren** (1 Punkte): Die Studierenden sollen die Methode
  vervollständigen, sodass neue Buchungseinträge zur Liste hinzugefügt werden können.
- **`deleteBookingEntry`-Methode implementieren** (0,75 Punkte): Implementierung der Methode, um
  Buchungseinträge aus der Liste entfernen zu können.

## Anmerkungen

---

- **Codequalität:**
    - Sauberer und lesbarer Code wird erwartet.
    - Sinnvolle Variablennamen und Strukturierung des Codes.
    - Kommentare sind hilfreich, aber nicht zwingend erforderlich.

- **Fehlerbehebung:**
    - Laufzeitfehler oder Abstürze führen zu Punktabzug.
    - Die App sollte stabil laufen und korrekt auf Benutzereingaben reagieren.

- **Ressourcennutzung:**
    - Die Studierenden sollen das bereitgestellte Codegerüst verwenden und erweitern.
    - Eigene Implementierungen von bereits gegebenen Teilen sind nicht notwendig und können zu
      Punktabzug führen, wenn Anforderungen nicht erfüllt werden.

---

## Hinweise für die Studierenden

- **Fokus der Aufgabe:**
    - Hauptaugenmerk liegt auf der Implementierung des DateRangePickers und der korrekten
      Verarbeitung der ausgewählten Daten.
    - Verständnis und Anwendung von Jetpack Compose und State-Management mit ViewModels.

- **Verwendung des Codegerüsts:**
    - Das Gerüst dient als Ausgangspunkt und soll nicht vollständig neu geschrieben werden.
    - Die bereitgestellten Klassen und Funktionen sollen genutzt und erweitert werden.

- **Dokumentation und Ressourcen:**
    - Es wird empfohlen, die offizielle Android-Dokumentation zu Jetpack Compose und den verwendeten
      Komponenten zu konsultieren.
    - Bei Fragen können auch Online-Ressourcen und Foren hilfreich sein.


**Viel Erfolg bei der Umsetzung der Aufgabe!**