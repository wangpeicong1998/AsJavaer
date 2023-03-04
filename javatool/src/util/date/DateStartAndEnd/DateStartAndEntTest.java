package util.date.DateStartAndEnd;

import java.time.LocalDateTime;

/**
 * @description: DateStartAndEndTest
 * @ClassName DateStartAndEntTest
 * @author: c.green
 * @date: 2023/3/4 10:44
 **/
public class DateStartAndEntTest {
    public static void main(String[] args) {
        System.out.println(getTodayStartTimeTest());
        System.out.println(getToWeekStartTimeTest());
        System.out.println(getToMonthStartTimeTest());
        System.out.println(getToYearStartTimeTest());

        DateStartAndEnd of = DateStartAndEnd.of(7, DateStartAndEndType.LAST_DAY);
        System.out.println(of.getStartTime() + " " + of.getEndTime());
    }

    public static LocalDateTime getTodayStartTimeTest() {
        return DateStartAndEnd.getTodayStartTime();
    }

    public static LocalDateTime getToWeekStartTimeTest() {
        return DateStartAndEnd.getToWeekStartTime();
    }

    public static LocalDateTime getToMonthStartTimeTest() {
        return DateStartAndEnd.getToMonthStartTime();
    }

    public static LocalDateTime getToYearStartTimeTest() {
        return DateStartAndEnd.getToYearStartTime();
    }

}
