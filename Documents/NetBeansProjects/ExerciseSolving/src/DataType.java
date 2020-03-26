
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
public class DataType {
    
    public static void main(String[] args){
        Number10();
    }
    
    
    public static void Number1(){
        System.out.println("1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor\n" +
                            "Test Data\n" +
                            "Input a degree in Fahrenheit: 212\n" +
                            "Expected Output:\n" +
                            "212.0 degree Fahrenheit is equal to 100.0 in Celsius");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double  celsius =((5*(fahrenheit - 32.0))/9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program that reads a number in inches, converts it to meters. \n" +
                            "Note: One inch is 0.0254 meter.\n" +
                            "Test Data\n" +
                            "Input a value for inch: 1000\n" +
                            "Expected Output :\n" +
                            "1000.0 inch is 25.4 meters");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = in.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor\n" +
                            "Test Data\n" +
                            "Input an integer between 0 and 1000: 565\n" +
                            "Expected Output :\n" +
                            "The sum of all digits in 565 is 16");
        System.out.println("");
        System.out.println("Input an integer between 0 and 1000: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int first = number %10;
        int sisa = number / 10;
        int second = sisa % 10;
        sisa = sisa / 10;
        int third = sisa % 10;
        sisa = sisa / 10;
        int fourth = sisa %10;
        int summary = first + second + third + fourth;
        System.out.println("The sum of all digits in "+number+" is "+summary);
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java program to convert minutes into a number of years and days. \n" +
                            "Test Data\n" +
                            "Input the number of minutes: 3456789\n" +
                            "Expected Output :\n" +
                            "3456789 minutes is approximately 6 years and 210 days");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        int number = in.nextInt();
        int minuteToYear = 60 * 24 * 365;
        int minuteToDay = 60 * 24;
        int years = (number/minuteToYear);
        int days = ((number/minuteToDay)%365);
        System.out.println(number+" minutes is approxximately "+years+" years and "+days+" days");
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program that prints the current time in GMT. \n" +
                            "Test Data\n" +
                            "Input the time zone offset to GMT: 256\n" +
                            "Expected Output:\n" +
                            "Current time is 23:40:24");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT: ");
        int input = in.nextInt();
        long timeMili = System.currentTimeMillis();
        long totalSecond = timeMili / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = ((totalHours + input)%24);
        System.out.println("Current time is "+ currentHours+":"+currentMinutes+":"+currentSecond);
        
    }

    public static void Number6(){
        System.out.println("6. Write a Java program to compute body mass index (BMI). \n" +
                            "Test Data\n" +
                            "Input weight in pounds: 452\n" +
                            "Input height in inches: 72\n" +
                            "Expected Output:\n" +
                            "Body Mass Index is 61.30159143458721");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        double weight = in.nextInt();
        System.out.println("Input Height in pounds: ");
        double height = in.nextInt();
        double bodyMassIndex = ((weight*0.45359237)/((height*0.0254)*(height*0.0254)));
        System.out.println("Body Mass Index is "+bodyMassIndex);
    }
       
    public static void Number7(){
        System.out.println("7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). \n" +
                            "Test Data\n" +
                            "Input distance in meters: 2500 \n" +
                            "Input hour: 5 \n" +
                            "Input minutes: 56\n" +
                            "Input seconds: 23\n" +
                            "Expected Output :\n" +
                            "Your speed in meters/second is 0.11691531 \n" +
                            "Your speed in km/h is 0.42089513 \n" +
                            "Your speed in miles/h is 0.26158804");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        double distance = in.nextInt();
        System.out.println("Input hours: ");
        double hours = in.nextInt();
        System.out.println("Input minutes: ");
        double minutes = in.nextInt();
        System.out.println("Input seconds: ");
        double seconds = in.nextInt();
        
        double timeSeconds = (hours*3600) + (minutes*60) + seconds;
        double meterPerSecond = distance / timeSeconds;
        double kiloMeterPerHour = ( distance/1000 ) / ( timeSeconds/3600 );
	double milePerHour = kiloMeterPerHour / 1.609;
                        
        System.out.println(meterPerSecond);
        System.out.println(kiloMeterPerHour);
        System.out.println(milePerHour);
    }
    
    public static void Number8(){
        System.out.println("8. Write a Java program that reads a number and display the square, cube, and fourth power. Go to the editor\n" +
                            "Expected Output:\n" +
                            "Square: .2f \n" +
                            "Cube: .2f \n" +
                            "Fourth power: 50625.00");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
    
    public static void Number9(){
        System.out.println("9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).\n" +
                            "Test Data\n" +
                            "Input 1st integer: 25 \n" +
                            "Input 2nd integer: 5\n" +
                            "Expected Output :\n" +
                            "Sum of two integers: 30\n" +
                            "Difference of two integers: 20\n" +
                            "Product of two integers: 125\n" +
                            "Average of two integers: 15.00\n" +
                            "Distance of two integers: 20\n" +
                            "Max integer: 25 \n" +
                            "Min integer: 5");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Input 1st integer: ");
        int first = in.nextInt();
        System.out.println("Input 2nd integer: ");
        int second = in.nextInt();
        System.out.println("Answer:");
        System.out.println("Sum of two integers: "+(first+second));
        System.out.println("Difference of two integers: "+(first-second));
        System.out.println("Product of two integers: "+(first*second));
        System.out.println("Average of two integers: "+(float)(first+second)/(2));
        System.out.println("Distance of two integers: "+(Math.abs(first-second)));
        System.out.println("Max integer: "+(Math.max(first, second)));
        System.out.println("Min integer: "+(Math.min(first, second)));
    }
    
    public static void Number10(){
        System.out.println("10. Write a Java program to break an integer into a sequence of individual digits.\n" +
                            "Test Data\n" +
                            "Input six non-negative digits: 123456\n" +
                            "Expected Output :\n" +
                            "1 2 3 4 5 6");

        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("input six non-negative digits: ");
        int number = in.nextInt();
        int n1 = ((number/100000)%10);
        int n2 = ((number/10000)%10);
        int n3 = ((number/1000)%10);
        int n4 = ((number/100)%10);
        int n5 = ((number/10)%10);
        int n6 = (number%10);
        System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
    }
}

