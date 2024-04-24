

package com.mycompany.ngayketiep;

public class NextDate {
    public static void main(String[] args) {
        // Example usage
        int day = 31;
        int month = 12;
        int year = 2012;
        
        String nextDate = nextDate(day, month, year);
        System.out.println("Next date: " + nextDate);
    }

    public static String nextDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Invalid input";
        }

        // Check for months with 30 days
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1;
            month++;
        } 
        // Check for February
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (day == 29) {
                    day = 1;
                    month++;
                }
            } else {
                if (day == 28) {
                    day = 1;
                    month++;
                }
            }
        }
        // Check for months with 31 days
        else if (day == 31) {
            if (month == 12) {
                day = 1;
                month = 1;
                year++;
            } else {
                day = 1;
                month++;
            }
        } else {
            day++;
        }

        return day + "/" + month + "/" + year;
    }
}
