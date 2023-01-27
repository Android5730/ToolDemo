package TimeStampORDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * {@code description:}
 * {@code author:} 物联系 ITAEM 陈金城
 * {@code create:} 2023-01-06 16:45
 **/
public class TimeStampORDate {
    public static void main(String[] args) {
        System.out.println(TimeStamp2Date("1001865600", "yyyy-MM-dd HH:mm:ss"));
        System.out.println(Date2TimeStamp("2023-01-01 00:00:00","yyyy-MM-dd HH:mm:ss"));

    }
    public static String TimeStamp2Date(String timestampString, String formats) {
            formats = "yyyy-MM-dd HH:mm:ss";
        Long timestamp = Long.parseLong(timestampString) * 1000;
        String date = new SimpleDateFormat(formats, Locale.CHINA).format(new Date(timestamp));
        return date;
    }
    public static String Date2TimeStamp(String dateStr, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(dateStr).getTime() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
