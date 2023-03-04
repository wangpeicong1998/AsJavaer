package util.date.DateStartAndEnd;

/**
 * @description: DateStartAndEndTest
 * @ClassName DateStartAndEntTest
 * @author: run.gan
 * @date: 2023/3/4 10:44
 **/
public class DateStartAndEntTest {
    public static void main(String[] args) {
        DateStartAndEnd of = DateStartAndEnd.of(7, DateStartAndEndType.LAST_DAY);
        System.out.println(of.getStartTime() + " " + of.getEndTime());
    }
}
