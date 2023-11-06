public class Date {

    public int day;
    public String month;
    public int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int getMaxDayForMonth(String month) {
        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                return 31;
            case "April":
            case "June":
            case "September":
            case "November":
                return 30;
            case "February":
                if (isLeapYear(this.year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public boolean isValidDate() {
        int maxDay = getMaxDayForMonth(this.month);
        return this.year > 0 && this.day >= 1 && this.day <= maxDay;
    }

    private static int WhichMonth(String month) {
        switch (month) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;

            default:
                return -1;
        }

    }

    private static int CompearingDates(Date date1, Date date2) {
        if (date1 != null && date2 != null) {
            if (date1.year == date2.year) {
                if (WhichMonth(date1.month) < WhichMonth(date2.month)) {
                    return 1;
                } else if (WhichMonth(date1.month) == WhichMonth(date2.month)) {
                    if (date1.day < date2.day) {
                        return 1;
                    } else if (date1.day == date2.day) {
                        return 2;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else if (date1.year < date2.year) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }

    }

    ;

    public static void CompareDates(Date date1, Date date2) {
        int previousDate = CompearingDates(date1, date2);

        if (previousDate == 1) {
            System.out.printf("Date1: %d - %s - %d is before Date2: %d - %s - %d %n", date1.day, date1.month, date1.year, date2.day, date2.month, date2.year);
        } else if (previousDate == 0) {
            System.out.printf("Date2: %d - %s - %d is before Date1: %d - %s - %d %n", date2.day, date2.month, date2.year, date1.day, date1.month, date1.year);
        } else {
            System.out.printf("Date1: %d - %s - %d is equal to Date2: %d - %s - %d %n", date1.day, date1.month, date1.year, date2.day, date2.month, date2.year);
        }
    };


}

