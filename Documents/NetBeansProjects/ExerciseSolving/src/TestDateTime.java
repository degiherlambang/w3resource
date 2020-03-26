
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestDateTime {
    public static void main(String[]args){
        Number10();
    }
    
    public static void Number1(){
    System.out.print("1. Write a Java program to create a Date object using the Calendar class. \n");
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.getTime());
    }
    
    public static void Number2(){
    System.out.println("2. Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar. \n");
    Calendar calendar = Calendar.getInstance();
    System.out.println("Year: "+calendar.get(Calendar.YEAR));
    System.out.println("Month: "+calendar.get(Calendar.MONTH));
    System.out.println("Day: "+calendar.get(Calendar.DATE));
    System.out.println("Hour: "+calendar.get(Calendar.HOUR));
    System.out.println("Minute: "+calendar.get(Calendar.MINUTE));
    }
    
    public static void Number3(){
    System.out.println("3. Write a Java program to get the minimum value of the year, month, week, date from the current date of a default calendar. \n");
    Calendar calendar = Calendar.getInstance();
    System.out.println("Max Year: "+calendar.getActualMinimum(Calendar.YEAR));
    System.out.println("Max Month: "+calendar.getActualMinimum(Calendar.MONTH));
    System.out.println("Max Week: "+calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
    System.out.println("Max Day: "+calendar.getActualMinimum(Calendar.DATE));
    }
    
    public static void Number4(){
    System.out.println("4. Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar.");
    Calendar calendar = Calendar.getInstance();
    System.out.println("Max Year: "+calendar.getActualMinimum(Calendar.YEAR));
    System.out.println("Max Month: "+calendar.getActualMinimum(Calendar.MONTH));
    System.out.println("Max Week: "+calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
    System.out.println("Max Day: "+calendar.getActualMinimum(Calendar.DATE));
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program to get the current time in New York \n");
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
               + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
    }
    
    public static void Number6(){
        System.out.println("6. Write a Java program to get current full date and time. \n");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
    
    public static void Number7(){
        System.out.println("7. Write a Java program to get the last day of the current month. \n");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
    
    public static void Number8(){
    System.out.println("8. Write a Java program to get the last date of the month. \n");
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.getTime());
    }
    
    public static void Number9(){
    System.out.println("9. Write a Java program to calculate the first and last day of each week. \n");
    Calendar c = Calendar.getInstance();
    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
    System.out.println(df.format(c.getTime()));
    for (int i = 0; i <6; i++) {
    c.add(Calendar.DATE, 1);
    }
    System.out.println(df.format(c.getTime()));
    }
    
    public static void Number10(){
    System.out.println("10. Write a Java program to get the name of the first and last day of a month. \n");
    YearMonth yearMonth = YearMonth.of(2020, 2);
        String firstDay = yearMonth.atDay(1).getDayOfWeek().name();
        String lastDay = yearMonth.atEndOfMonth().getDayOfWeek().name();
        System.out.println("First Day: "+firstDay);
        System.out.println("Last Day: "+lastDay);
    
    }
}
