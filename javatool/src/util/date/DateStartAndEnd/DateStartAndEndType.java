package util.date.DateStartAndEnd;

/**
 * @author c.green
 */

public enum DateStartAndEndType {
    LAST_DAY("lastDay"),
    LAST_WEEK("lastWeek"),
    LAST_MONTH("lastMonth"),
    lAST_YEAR("lastYear"),
    PAST_DAY("pastDay"),
    PAST_WEEK("paskWeek"),
    PAST_MONTH("pastMonth"),
    PAST_YEAR("pastYear")
    ;
    private String name;

    DateStartAndEndType(String name) {
        this.name = name;
    }
}
