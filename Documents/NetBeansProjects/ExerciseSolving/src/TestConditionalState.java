
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestConditionalState {
    public static void main(String[]args){
        Number10();
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java program to get a number from the user and print whether it is positive or negative. \n" +
                            "Test Data\n" +
                            "Input number: 35\n" +
                            "Expected Output :\n" +
                            "Number is positive");
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program to solve quadratic equations (use if, else if and else).\n" +
                            "Test Data\n" +
                            "Input a: 1 \n" +
                            "Input b: 5 \n" +
                            "Input c: 1\n" +
                            "Expected Output :\n" +
                            "The roots are -0.20871215252208009 and -4.7912878474779195 ");
        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }
    }
    
    public static void Number3(){
        System.out.println("3. Take three numbers from the user and print the greatest number. \n" +
                            "Test Data\n" +
                            "Input the 1st number: 25 \n" +
                            "Input the 2nd number: 78 \n" +
                            "Input the 3rd number: 87\n" +
                            "Expected Output :\n" +
                            "The greatest: 87\n" +
                            "");
        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
        if (num1 > num2)
         if (num1 > num3)
          System.out.println("The greatest: " + num1);
        if (num2 > num1)
         if (num2 > num3)
          System.out.println("The greatest: " + num2);
        if (num3 > num1)
         if (num3 > num2)
          System.out.println("The greatest: " + num3);
    }
    
    public static  void Number4(){
        System.out.println("4. Write a Java program that reads a floating-point number and prints \"zero\" if the number is zero. Otherwise, print \"positive\" or \"negative\". Add \"small\" if the absolute value of the number is less than 1, or \"large\" if it exceeds 1,000,000. \n" +
                            "Test Data\n" +
                            "Input a number: 25 \n" +
                            "Expected Output :\n" +
                            "Input value: 25 \n" +
                            "Positive number");
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();
        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. \n" +
                            "Test Data\n" +
                            "Input number: 3 \n" +
                            "Expected Output :\n" +
                            "Wednesday");
        Scanner in = new Scanner(System.in);
        System.out.print("input number: ");
        int number = in.nextInt();
        String day = "";
        switch(number){
            case 1: day = "Monday";break;
            case 2: day = "Tuesday";break;
            case 3: day = "Wenesday";break;
            case 4: day = "Thursday";break;
            case 5: day = "Friday";break;
            case 6: day = "Saturday";break;
            case 7: day = "Sunday";break;
            default:day = "Invalid day";
        }
        System.out.println(day);    
    }
    
    public static void Number6(){
        System.out.println("6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. \n" +
                            "Test Data\n" +
                            "Input floating-point number: 1256\n" +
                            "Input floating-point another number: 3254\n" +
                            "Expected Output :\n" +
                            "They are different ");
        Scanner in = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();
        x = Math.round(x * 1000);
        x = x / 1000;
        y = Math.round(y * 1000);
        y = y / 1000;
        if (x == y){
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
    
    public static void Number7(){
        System.out.println("7. Write a Java program to find the number of days in a month. \n" +
                            "Test Data\n" +
                            "Input a month number: 2\n" +
                            "Input a year: 2016\n" +
                            "Expected Output :\n" +
                            "February 2016 has 29 days ");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = in.nextInt();
        System.out.print("Input a year number: ");
        int year = in.nextInt();
        String monthName = "";
        int numberDay = 0;
        switch (month){
            case 1: monthName="January";numberDay=31;break;
            case 2: monthName="February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberDay = 29;
                } else {
                    numberDay = 28;
                }
                    ;break;
            case 3: monthName="March";numberDay=31;break;
            case 4: monthName="April";numberDay=30;break;
            case 5: monthName="May";numberDay=31;break;
            case 6: monthName="June";numberDay=30;break;
            case 7: monthName="July";numberDay=31;break;
            case 8: monthName="August";numberDay=31;break;
            case 9: monthName="September";numberDay=30;break;
            case 10: monthName="Oktober";numberDay=31;break;
            case 11: monthName="November";numberDay=30;break;
            case 12: monthName="Desember";numberDay=31;break;
        }
        System.out.println(monthName+" "+year+" has "+numberDay+" days");
    }
    
    public static void Number8(){
        System.out.println("8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.\n" +
                            "Test Data\n" +
                            "Input an alphabet: p\n" +
                            "Expected Output :\n" +
                            "Input letter is Consonant");
         Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
    
    public static void Number9(){
        System.out.println("9. Write a Java program that takes a year from user and print whether that year is a leap year or not. \n" +
                            "Test Data\n" +
                            "Input the year: 2016\n" +
                            "Expected Output :\n" +
                            "2016 is a leap year");
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
    
    public static void Number10(){
        System.out.println("10. Write a program in Java to display the first 10 natural numbers. \n" +
                            "Expected Output :\n" +
                            "The first 10 natural numbers are:                                                \n" +
                            "                                                                                 \n" +
                            "1                                                                                \n" +
                            "2                                                                                \n" +
                            "3                                                                                \n" +
                            "4                                                                                \n" +
                            "5                                                                                \n" +
                            "6                                                                                \n" +
                            "7                                                                                \n" +
                            "8                                                                                \n" +
                            "9                                                                                \n" +
                            "10");
        System.out.println("");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
