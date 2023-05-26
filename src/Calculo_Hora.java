import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo_Hora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-10-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-10-15T16:00:26");
        Instant d06 = Instant.parse("2024-10-15T16:00:26Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("d04 Uma Semana antes: " + pastWeekLocalDate);
        System.out.println("d04 Uma Semana depois: " + nextWeekLocalDate);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("d06 Uma Semana antes: " + pastWeekInstant);
        System.out.println("d06 Uma Semana depois: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0)); //os dois metodos convertem da mesma maneira
        Duration t2 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());




    }
}
