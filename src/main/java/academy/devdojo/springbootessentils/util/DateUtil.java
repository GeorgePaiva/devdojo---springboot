package academy.devdojo.springbootessentils.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component //tranformar class no bean para ser gerenciado pelo spring
public class DateUtil {

    public String formatLocalDateTimeToDataBaseStyle(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd: HH:mm:ss").format(localDateTime);
    }
}
