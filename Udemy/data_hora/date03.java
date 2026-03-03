package data_hora;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class date03 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-02-21");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-21T01:30:26");
        Instant d06 = Instant.parse("2026-02-21T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // d04 - 7 days
        LocalDate nextWeekLocalDate = d04.plusDays(7); // d04 + 7 days

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.plusHours(3).plusMinutes(15);
        LocalDateTime nextWeekLocalDateTime = d05.plusSeconds(16);
        System.out.println("--------------------------------");

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("--------------------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.HOURS);
        Instant nextWeekInstant  = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // Covert LocalDate type to LocalDateTime
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("--------------------------------");

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 horas = " + t2.toHours());
        System.out.println("t3 dias = " + t3.toHours());
    }
}
