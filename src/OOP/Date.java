package Kushwaha.OOP;

import java.util.Scanner;
import java.lang.Math;

public class Date {
    int day;
    int month;
    int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String monthName(int month){
        String [] month_list = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return (month_list[month-1]);
    }
    public int monthDays(int month){
        if(checkleap(year)){
            return 29;
        }
        int [] month_max_list = {31,28,31,30,31,30,31,31,30,31,30,31};
        return month_max_list[month-1];
    }

    boolean checkleap(int year){
        boolean leap = false;
        if(year%4==0 && (year%100!=0 || year%400==0)){
            leap = true;
        }
        return leap;
    }

    public void displayNumeric(){
        System.out.println(month+"/"+day+"/"+year%1000);
    }
    public void displayMonthFirst(){
        System.out.println(monthName(month)+" "+day+" ,"+year);
    }
    public void displayMonthSecond(){
        System.out.println(day+" "+monthName(month)+" "+year);
    }
    public void incrementDay(){
        Scanner in = new Scanner(System.in);
        int new_days;
        System.out.print("Enter the number of days to add : ");
        new_days = in.nextInt();
        for (int i = 0; i < new_days; i++) {
            day += 1;
            if(day > monthDays(month)){
                day = 1;
                month+=1;
                if(month > 12){
                    month = 1;
                    year += 1;
                }
            }
        }
    }

    public void decrementDay(){
        Scanner in = new Scanner(System.in);
        int new_days;
        System.out.print("Enter the number of days to subtract : ");
        new_days = in.nextInt();
        for (int i = 0; i < new_days; i++) {
            day -= 1;
            if(day < 1){
                month--;
                if(month<1){
                    month = 12;
                    year--;
                }
                day = monthDays(month);

            }
        }
    }


    int substractDate(Date one, Date two){
        int count = 0;

            while(one.year != two.year){
                one.day--;
                count++;
                if(one.day<1){
                    one.month--;
                    one.day = monthDays(month);
                    count++;
                    if(one.month<1){
                        one.month = 12;
                        one.year--;
                        one.day = 31;
                        count++;
                    }

                }
            }

            while(one.month != two.month){
                one.day--;
                count++;
                if(one.day<1){
                    one.month--;
                    one.day = monthDays(one.month);
                    count++;
                }
            }

            while (one.day != two.day){
                one.day--;
                count++;
            }

            return count;

    }
}
