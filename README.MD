# Bewertungsschema für die Programmieraufgabe

**Gesamtpunktzahl: 20 Punkte**

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

### 1. `BookingEntry.kt` (1,5 Punkte)

- **Korrekte Implementierung der Datenklasse** (1,5 Punkte)

    - Attribute:
        - `arrivalDate` (0,5 Punkte): `LocalDate` oder entsprechender Typ zur Speicherung des
          Ankunftsdatums.
        - `departureDate` (0,5 Punkte): `LocalDate` oder entsprechender Typ zur Speicherung des
          Abreisedatums.
        - `name` (0,5 Punkte): `String` zur Speicherung des Namens der Buchung.

### 2. `AddScreen.kt` (9 Punkte)

- **Implementierung des `DateRangePickerModal`** (5 Punkte)

    - **Methode für den Dialog implementieren** (2 Punkte): Die Studierenden sollen die
      Methode `DateRangePickerModal` erstellen, die den Dialog zur Datumsauswahl anzeigt.
    - **Logik zur Anzeige des Dialogs implementieren** (1,5 Punkte): Korrekte Integration des
      Dialogs in den `AddScreen`, sodass der Dialog beim Klick auf das entsprechende Feld geöffnet
      wird.
    - **Konvertierung der ausgewählten Long-Werte in `LocalDate`** (1,5 Punkte): Nach Auswahl eines
      gültigen Zeitraums sollen die erhaltenen `Long`-Werte korrekt in `LocalDate` umgewandelt und
      in den entsprechenden Variablen gespeichert werden.

    - **Save-Button Funktionalität:**

      - **Error Handling** (2 Punkte): Implementierung von Fehlermeldungen oder Validierungen, wenn
        der Name nicht eingegeben wurde oder kein gültiges Datum ausgewählt wurde.
        - **Erstellen und Speichern des `BookingEntry`-Objekts** (2 Punkte): Bei korrekten Eingaben soll
          ein neues `BookingEntry`-Objekt erstellt und im `SharedViewModel` gespeichert werden.

- **Save-Button Funktionalität** (4 Punkte)

    - Error Handling bei fehlendem Namen oder ungültigem Datum (2 Punkte)
    - Erstellen und Speichern eines neuen `BookingEntry`-Objekts im `SharedViewModel`, wenn die
      Eingaben korrekt sind (2 Punkte)

### 3. `HomeScreen.kt` (6 Punkte)

- **Anzeige der Buchungseinträge** (3 Punkte)

    - **Verwendung von `LazyColumn`** (1,5 Punkte): Die Studierenden sollen die Buchungseinträge
      mithilfe einer `LazyColumn` anzeigen, wenn die Liste `bookingsEntries` nicht leer ist.
    - **Anzeige bei leerer Liste** (1,5 Punkte): Wenn keine Buchungseinträge vorhanden sind, soll
      eine entsprechende Nachricht angezeigt werden.

- **`BookingEntryItem` Composable** (3 Punkte)

    - **Anzeige des Namens** (1,5 Punkte): Jeder Buchungseintrag soll den Namen korrekt anzeigen.
    - **Anzeige des Datums im richtigen Format** (1,5 Punkte): Die Ankunfts- und Abreisedaten sollen
      im Format `dd.MM.yyyy` angezeigt werden.

### 4. `SharedViewModel.kt` (3,5 Punkte)

- **`addBookingEntry`-Methode implementieren** (2 Punkte): Die Studierenden sollen die Methode
  vervollständigen, sodass neue Buchungseinträge zur Liste hinzugefügt werden können.
- **`deleteBookingEntry`-Methode implementieren** (1,5 Punkte): Implementierung der Methode, um
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

---

## Notenschlüssel (zur Orientierung)

- **Sehr gut (1,0):** 18 - 20 Punkte
- **Gut (2,0):** 16 - 17,5 Punkte
- **Befriedigend (3,0):** 14 - 15,5 Punkte
- **Ausreichend (4,0):** 12 - 13,5 Punkte
- **Nicht bestanden (5,0):** 0 - 11,5 Punkte

---

**Viel Erfolg bei der Umsetzung der Aufgabe!**