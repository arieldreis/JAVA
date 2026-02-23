package data_hora;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class date03 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-02-21");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-21T01:30:26");
        Instant d06 = Instant.parse("2026-02-21T01:30:26Z");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(13);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(14);

        Duration t1 =  Duration.between(pastWeekLocalDateTime.at, d04); // Calcula o tempo entre duas datas.
        Duration t2 =  Duration.between(pastWeekLocalDateTime, d05); // Calcula o tempo entre duas datas.

        System.out.println("t1 dias = " + t1.toMinutes()); // Transforma o tempo entre uma data e outra e converte para minutos
        System.out.println("t2 dias = " + t2.toMinutes());
    }
}
