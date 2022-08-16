package uz.pdp.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatter implements Formatter<LocalDateTime> {
//
//    @Override
//    public String print(LocalDate date, Locale locale) {
//        if (date == null) {
//            return "";
//        }
//        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//    }

    @Override
    public LocalDateTime parse(String formatted, Locale locale) throws ParseException {
        if (formatted.length() == 0) {
            return null;
        }
        return LocalDateTime.parse(formatted);
    }


    @Override
    public String print(LocalDateTime object, Locale locale) {
        if (object==null){
            return "";
        }
        return object.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

}

