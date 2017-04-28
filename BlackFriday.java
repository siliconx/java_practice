/**
 * Created by island on 17-3-12.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int years = in.nextInt();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate, endDate;
        int count = 0;
        try {
            startDate = formatter.parse(years++ + "-01-01");
            endDate = formatter.parse(years + "-01-01");
            Calendar start = Calendar.getInstance();
            start.setTime(startDate);
            Calendar end = Calendar.getInstance();
            end.setTime(endDate);
//            for (Date date = start.getTime();start.before(end);start.add(Calendar.DATE, 1), date = start.getTime()) {
//
//            }
            while (start.before(end)) {
                int week = start.get(Calendar.DAY_OF_WEEK);
                int day = start.get(Calendar.DAY_OF_MONTH);
                if (week == 5 && day == 13) {
                    count++;
                }
                start.add(Calendar.DATE, 1);
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
