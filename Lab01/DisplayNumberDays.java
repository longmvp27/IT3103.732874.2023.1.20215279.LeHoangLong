package Lab01;
// Exercise 6.4: Display number of days of a month in a year
import java.util.Scanner;
import java.lang.String;
public class DisplayNumberDays {
    public static int getNumberOfMonth(String month) {
        switch (month) {
            case "january": case "jan": case "1":
                return 1;
            case "february": case "feb": case "2":
                return 2;
            case "march": case "mar": case "3":
                return 3;
            case "april": case "apr": case "4":
                return 4;
            case "may": case "5":
                return 5;
            case "june": case "jun": case "6":
                return 6;
            case "july": case "jul": case "7":
                return 7;
            case "august": case "aug": case "8":
                return 8;
            case "september": case "sep": case "9":
                return 9;
            case "october": case "oct": case "10":
                return 10;
            case "november": case "nov": case "11":
                return 11;
            case "december": case "dec": case "12":
                return 12;
            default:
                return -1;
        }
    }
    public static boolean checkValidMonth(String month) {
        String[] monthStr = {"january", "february", "march", "april", "may", "june", "july",
                            "august", "september", "october", "november", "december"};
        for(String i : monthStr) {
            if(i.equals(month) || i.substring(0, 3).equals(month) || i.valueOf(getNumberOfMonth(month)).equals(month)) {
                return true;
            }
        }
        return false;
    }
    public static int checkLapYear(int year) {
        if((year % 4 == 0) || (year % 100 == 0 && year % 400 != 0)) {
            return 1;
        }
        return 0;
    }
    public static int getNumberOfDay(int month, int year) {
        int []days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(checkLapYear(year) == 0 && month == 2) {
            return 28;
        }
        return days[month - 1];
    }
    public static void main(String[] args) {
        System.out.println("Le Hoang Long - 20215279");
        Scanner sc = new Scanner(System.in);
        int day, year;
        String month;
        // Input MONTH
        while (true) {
            System.out.println("Enter month: ");
            month = sc.nextLine().toLowerCase();
            if(checkValidMonth(month) == true) {
                break;
            }
        }
        // Input Year
        while (true) {
            System.out.println("Enter year: ");
            year = sc.nextInt();
            if (year > 0) {
                break;
            }
        }
        System.out.println("Number of days of " + month + " in " + year + " is: " + getNumberOfDay(getNumberOfMonth(month), year));


    }
}
