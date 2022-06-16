package BaiTap9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String getNextDay(int d, int m, int y) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        Calendar calendar = Calendar.getInstance();
        calendar.set(y,m - 1, d+ 1);

        Date date = calendar.getTime();
        return dateFormat.format(date);
    }
}
