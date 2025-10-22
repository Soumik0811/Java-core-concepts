/*
| Class               | Use                                                |
| ------------------- | -------------------------------------------------- |
| `LocalDate`         | Represents a date (year-month-day) without time.   |
| `LocalTime`         | Represents time (hour-minute-second) without date. |
| `LocalDateTime`     | Represents both date and time, no timezone.        |
| `ZonedDateTime`     | Date and time **with timezone**.                   |
| `Instant`           | Timestamp — a point on the timeline (UTC).         |
| `Duration`          | Time-based amount (hours, minutes, seconds).       |
| `Period`            | Date-based amount (years, months, days).           |
| `DateTimeFormatter` | Format or parse date/time into strings.            |
*/
//Different class in DateTime API
class Main {
    public static void main(String[] args) {
        DateTime obj = new DateTime();
        obj.AgeCalculator();
    }
}
