
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
public class TestMethod {
    public static void main(String[]args){
        Number10();
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java method to find the smallest number among three numbers. \n" +
                            "Test Data:\n" +
                            "Input the first number: 25\n" +
                            "Input the Second number: 37\n" +
                            "Input the third number: 29 \n" +
                            "Expected Output:\n" +
                            "The smallest value is 25.0");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int first = in.nextInt();
        System.out.println("Input the second number: ");
        int second = in.nextInt();
        System.out.println("Input the third number: ");
        int third = in.nextInt();
        System.out.println("The smallest value is: "+smallest(first, second, third));
    }
        public static int smallest(int x, int y, int z){
            return Math.min(Math.min(x, y), z);
        }
    
    public static void Number2(){
        System.out.println("2. Write a Java method to compute the average of three numbers. \n" +
                            "Test Data:\n" +
                            "Input the first number: 25 \n" +
                            "Input the second number: 45\n" +
                            "Input the third number: 65\n" +
                            "Expected Output:\n" +
                            "The average value is 45.0");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int first = in.nextInt();
        System.out.println("Input the second number: ");
        int second = in.nextInt();
        System.out.println("Input the third number: ");
        int third = in.nextInt();
        System.out.println("The average value is "+average(first, second, third));
    }
        public static int average(int x, int y, int z){
            return ((x+y+z)/3);
        }
    
    public static void Number3(){
        System.out.println("3. Write a Java method to display the middle character of a string. \n" +
                            "Note: a) If the length of the string is odd there will be two middle characters.\n" +
                            "b) If the length of the string is even there will be one middle character.\n" +
                            "Test Data:\n" +
                            "Input a string: 350 \n" +
                            "Expected Output:\n" +
                            "                                                                          \n" +
                            "The middle character in the string: 5");
        Scanner in = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = in.nextLine();
        System.out.println("The middle character in the string: "+middle(str));
    }
        public static String middle(String str){
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java method to count all vowels in a string. \n" +
                            "Test Data:\n" +
                            "Input the string: w3resource \n" +
                            "Expected Output:\n" +
                            "Number of  Vowels in the string: 4");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = in.nextLine();
        System.out.println("Number of Vowels in the string: "+countVowels(str));
    }
        public static int countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java method to count all words in a string. \n" +
                            "Test Data:\n" +
                            "Input the string: The quick brown fox jumps over the lazy dog.\n" +
                            "Expected Output:\n" +
                            "Number of words in the string: 9");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = in.nextLine();
        System.out.println("Number of words in the string: "+countString(str));
    }
        public static int countString(String str)    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))){
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count;
    }
    
    public static void Number6(){
        System.out.println("6. Write a Java method to compute the sum of the digits in an integer. \n" +
                            "Test Data:\n" +
                            "Input an integer: 25\n" +
                            "Expected Output:\n" +
                            "The sum is 7 ");
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = in.nextInt();
        System.out.println("The sym is "+sum(number));
    }
        public static int sum(int num){
            int result = 0;
		while(num > 0) {
			result += num % 10;
			num /= 10;
		}
                return result;
        }
    
    public static void Number7(){
        System.out.println("7. Write a Java method to display the first 50 pentagonal numbers. \n" +
                            "Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.\n" +
                            "Expected Output:\n" +
                            "1     5     12    22    35    51    70    92    117   145\n" +
                            "176   210   247   287   330   376   425   477   532   590\n" +
                            "651   715   782   852   925   1001  1080  1162  1247  1335\n" +
                            "1426  1520  1617  1717  1820  1926  2035  2147  2262  2380\n" +
                            "2501  2625  2752  2882  3015  3151  3290  3432  3577  3725 ");
        System.out.println("----------");
        int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d",getPentaNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
        public static int getPentaNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
    
    public static void Number8(){
        System.out.println("8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.\n" +
                            "Sample data (Monthly compounded) and Output:\n" +
                            "Input the investment amount: 1000\n" +
                            "Input the rate of interest: 10\n" +
                            "Input number of years: 5 \n" +
                            "Expected Output:\n" +
                            "Years    FutureValue                                     \n" +
                            "1            1104.71                                     \n" +
                            "2            1220.39                                     \n" +
                            "3            1348.18                                     \n" +
                            "4            1489.35                                     \n" +
                            "5            1645.31");
        System.out.println("");
        Scanner in = new Scanner(System.in); 
        System.out.print("Input the investment amount: ");
 	double investment = in.nextDouble();
 	System.out.print("Input the rate of interest: ");
	double rate = in.nextDouble();
	System.out.print("Input number of years: ");
	int year = in.nextInt();
	rate *= 0.01;
	System.out.println("Years    FutureValue");
	for(int i = 1; i <= year; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
            }
	}
        public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
    
    public static void Number9(){
        System.out.println("9. Write a Java method to print characters between two characters (i.e. A to P ). \n" +
                            "Note: Prints 20 characters per line\n" +
                            "Expected Output:\n" +
                            "( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  \n" +
                            "< = > ? @ A B C D E F G H I J K L M N O                  \n" +
                            "P Q R S T U V W X Y Z [ \\ ] ^ _ ` a b c                  \n" +
                            "d e f g h i j k l m n o p q r s t u v w                  \n" +
                            "x y z");
        System.out.println("");
        printChar('(', 'z', 20);
    }
        public static void printChar(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
		System.out.print("\n");
    }
    
    public static void Number10(){
        System.out.println("10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not.\n" +
                            "Expected Output:\n" +
                            "Input a year: 2017                                                                        \n" +
                            "false");
    Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();

        System.out.println(is_LeapYear(year));
    }
        public static boolean is_LeapYear(int y){
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}
