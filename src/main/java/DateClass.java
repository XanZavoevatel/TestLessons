import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateClass {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2022, Month.MARCH, 6);
        LocalDateTime localDateTime = LocalDateTime
                .of(2022, Month.MARCH, 6, 10, 58, 45);
        String string = localDateTime.format(DateTimeFormatter
                .ofPattern("eeee dd=yyyy месяц MM HH mm ss", Locale.GERMAN));
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(string);



        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1970, Calendar.JANUARY, 1 , 0 , 0, 0);
        TimeZone timeZone = TimeZone.getTimeZone("GTM+4");
        calendar1.setTimeZone(timeZone);
        System.out.println(calendar1.getTimeInMillis());


    }

}
