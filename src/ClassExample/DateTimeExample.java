package ClassExample;
import java.time.LocalTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalTime localDate = LocalTime.now();
        System.out.println(localDate);
        LocalTime localTime2 = LocalTime.now().withHour(5).withMinute(5);

    }
}