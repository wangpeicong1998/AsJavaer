package util.date.DateStartAndEnd;

/**
 * @author run.gun
 */
public enum DateStartAndEndType {
    /**
     * the last day from at the current node
     * */
    LAST_DAY("lastDay"),

    /**
     * the last week from at the current node
     * */
    LAST_WEEK("lastWeek"),

    /**
     * the last month from at the current node
     * */
    LAST_MONTH("lastMonth"),

    /**
     * the last year from at the current node
     * */
    LAST_YEAR("lastYear"),

    /**
     * the past day from at the today started current node
     * */
    PAST_DAY("pastDay"),

    /**
     * the past week from at the today started current node
     * */
    PAST_WEEK("paskWeek"),

    /**
     * the past month from at the today started current node
     * */
    PAST_MONTH("pastMonth"),

    /**
     * the past year from at the today started current node
     * */
    PAST_YEAR("pastYear")
    ;
    private String name;

    DateStartAndEndType(String name) {
        this.name = name;
    }
}
