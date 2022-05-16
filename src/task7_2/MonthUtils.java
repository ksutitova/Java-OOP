package task7_2;

public class MonthUtils {

    private static Month[] YEAR = {
            new Month("January",31,23),
            new Month("February",28,20),
            new Month("March",31,23),
            new Month("April",30,22),
            new Month("May",31,24),
            new Month("June",30,22),
            new Month("July",31,23),
            new Month("August",31,23),
            new Month("September",30,22),
            new Month("October",31,23),
            new Month("November",30,22),
            new Month("December",31,20)
    };

    public static Month getMonth(int index) {
        return YEAR[index];
    }

    public static int getMonthsCount(){
        return YEAR.length;
    }
     public static Month[] getYEAR(){
        return YEAR;
     }
}
