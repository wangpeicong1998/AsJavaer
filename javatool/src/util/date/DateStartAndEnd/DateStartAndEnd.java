package util.date.DateStartAndEnd;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @description: get the startTime and Endtime
 * @ClassName DateStartAndEnd
 * @author: c.green
 * @date: 2023/3/4 10:17
 **/
public class DateStartAndEnd
{
    private final LocalDateTime startTime;

    private final LocalDateTime endTime;

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    private DateStartAndEnd(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static DateStartAndEnd of(int count, DateStartAndEndType dateStartAndEndType) {
        LocalDateTime startTime = null;
        LocalDateTime endTime = null;
        LocalDateTime now = LocalDateTime.now();
        switch (dateStartAndEndType) {
            case LAST_DAY: return new DateStartAndEnd(now.minus(count, ChronoUnit.DAYS), now);
            case LAST_WEEK: return new DateStartAndEnd(now.minus(count, ChronoUnit.WEEKS), now);
            case LAST_MONTH: return new DateStartAndEnd(now.minus(count, ChronoUnit.MONTHS), now);
            case lAST_YEAR: return new DateStartAndEnd(now.minus(count, ChronoUnit.YEARS), now);
            case PAST_DAY: return new DateStartAndEnd(getTodayStartTime().minus(count, ChronoUnit.DAYS), getTodayStartTime());
            case PAST_WEEK: return new DateStartAndEnd(getToWeekStartTime().minus(count, ChronoUnit.WEEKS), getToWeekStartTime());
            case PAST_MONTH: return new DateStartAndEnd(getToMonthStartTime().minus(count, ChronoUnit.MONTHS), getToMonthStartTime());
            case PAST_YEAR: return new DateStartAndEnd(getToMonthStartTime().minus(count, ChronoUnit.YEARS), getToYearStartTime());
        }
        return new DateStartAndEnd(startTime, endTime);
    }

    public static LocalDateTime getTodayStartTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.withHour(0).withMinute(0).withSecond(0).withNano(0);
    }

    public static LocalDateTime getToWeekStartTime() {
        return getTodayStartTime().with(ChronoField.DAY_OF_WEEK,1);
    }

    public static LocalDateTime getToMonthStartTime() {
        return getTodayStartTime().withDayOfMonth(1);
    }

    public static LocalDateTime getToYearStartTime() {
        return getTodayStartTime().withDayOfYear(1);
    }
}
