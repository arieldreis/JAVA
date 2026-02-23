package data_hora;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class date02 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-02-21");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-21T01:30:26");
        Instant d06 = Instant.parse("2026-02-21T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // d04 - 7 days
        LocalDate nextWeekLocalDate = d04.plusDays(7); // d04 + 7 days
        System.out.println("----------------------------------------");

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("----------------------------------------");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("----------------------------------------");

        System.out.println("patWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("----------------------------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // d06 - 7 days, vale lembrar que vc passa o números que vc quer que diminua e o objeto ChronoUnit para fazer o calculo
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // d06 + 7 days, vale lembrar que vc passa o números que vc quer que aumente e o objeto ChronoUnit para fazer o calculo
        System.out.println("----------------------------------------");

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
    }
}
