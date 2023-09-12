package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        } else {
            int daysInMonth = getDaysInMonth(month);
            System.out.println(daysInMonth);
        }
   }

    public static int getDaysInMonth(int monthNumber) {
        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 ||
                monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
            return 31;
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            return 30;
        } else if (monthNumber == 2) {
            return 28;
        } else {
            return -1;
        }
   }

}
