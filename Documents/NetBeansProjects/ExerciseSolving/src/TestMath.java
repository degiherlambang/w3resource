
import java.math.BigDecimal;
import java.util.HashSet;
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
public class TestMath {
    public static void main(String[] args){
        Number1();
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java program to round up the result of integer division. \n");
        int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
        int percentage_of_marks = ((tot_theory_marks + tot_practical_marks)*100)/tot_marks;  
        System.out.print("\nPercentage of Marks: "+percentage_of_marks+"%\n");
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program to get whole and fractional parts from a double value. \n");
        double value = 12.56;
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;  
        System.out.print("\nOriginal value: "+value);
        System.out.print("\nIntegral part: "+integral_part);
        System.out.print("\nFractional part: "+fractional_part);
        System.out.println(); 
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program to test if a double number is an integer. \n");
        double num = 5.44444;
        if ((num % 1) == 0) {
         System.out.println("It is not");
        } else {
         System.out.println("It is");
        }
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java program to round a float number to specified decimals. \n");
        float x = 451.3256412f;
        BigDecimal result;
        int decimal_place = 4;
	BigDecimal bd_num = new BigDecimal(Float.toString(x));
        bd_num = bd_num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP); 
	System.out.printf("Original number: %.7f\n",x);
        System.out.println("Rounded upto 4 decimal: "+bd_num);
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program to count the absolute distinct value in an array. \n");
        int[] numbers = new int[] {
        -1, -1, 0, 2, 2, 3, 0, 1, 5, 9
        };
        int count = 0;
        HashSet < Integer > set = new HashSet < Integer > ();
        for (int i = 0; i < numbers.length; i++) {
        int n = Math.abs(numbers[i]);
        if (!set.contains(n)) {
         set.add(n);
         count++;
        }
       }
       System.out.println(count);
      }
        
    public static void Number6(){
        System.out.println("6. Write a Java program to reverse an integer number. \n");
        int num =1287;   
	int is_positive = 1;
        if (num < 0) {
            is_positive = -1;
            num = -1 * num;
        }
        int sum  = 0;
        while (num > 0) {
            int r = num % 10;
            
            int maxDiff = Integer.MAX_VALUE - sum * 10;
            if (sum > Integer.MAX_VALUE / 10 || r > maxDiff) 
				System.out.println("Wrong number");;
            
            sum = sum * 10 + r;
            num /= 10;
        }
        System.out.println(is_positive * sum);
    }
    
    public static void Number7(){
        System.out.println("7. Write a Java program to convert Roman number to an integer number. \n");
        String str = "DCCVII";
	int len = str.length();
        str = str + " ";
        int result = 0;
        for (int i = 0; i < len; i++) {
            char ch   = str.charAt(i);
            char next_char = str.charAt(i+1);
            
            if (ch == 'M') {
                result += 1000;
            } else if (ch == 'C') {
                if (next_char == 'M') {
                    result += 900;
                    i++;
                } else if (next_char == 'D') {
                    result += 400;
                    i++;
                } else {
                    result += 100;
                }
            } else if (ch == 'D') {
                result += 500;
            } else if (ch == 'X') {
                if (next_char == 'C') {
                    result += 90;
                    i++;
                } else if (next_char == 'L') {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } else if (ch == 'L') {
                result += 50;
            } else if (ch == 'I') {
                if (next_char == 'X') {
                    result += 9;
                    i++;
                } else if (next_char == 'V') {
                    result += 4;
                    i++;
                } else {
                    result++;
                }
            } else { // if (ch == 'V')
                result += 5;
            }
        }
       System.out.println("\nRoman Number: "+str);
	   System.out.println("Equivalent Integer: "+result+"\n");
    }
    
    public static void Number8(){
        System.out.println("8. Write a Java program to convert an integer value to absolute value. \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int x = in.nextInt();  
        System.out.printf("The absolute value of %d is: %d",x, convertInt (x));
		System.out.printf("\n");
    }
        public static int convertInt (int n){
            int absvalue = (n >= 0) ? n : -n;
		return absvalue;
	}
    
    public static void Number9(){
        System.out.println("9. Write a Java program to convert a float value to absolute value. \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a float number: ");
        float  x = in.nextFloat();  
        System.out.printf("The absolute value of %.2f is: %.2f",x, convertFloat(x));
		System.out.printf("\n");
    }
        public static float convertFloat (float n){
            float absvalue = (n >= 0) ? n : -n;
		return absvalue;
	}
    
    public static void Number10(){
        System.out.println("10. Write a Java program to accept a float value of number and return a rounded float value. \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a float number: ");
        float  x = in.nextFloat();  
        System.out.printf("The rounded value of %f is: %.2f",x, roundNum(x));
		System.out.printf("\n");
    }
	 public static float roundNum(float fn){
		float f_num = (float)Math.floor(fn);
		float c_num = (float)Math.ceil(fn);
		if ((fn - f_num) > (c_num - fn))
			{
				return c_num;
				}
		else if ((c_num - fn) > (fn - f_num)) 
		{
			return f_num;
			}
		else 
		{ 
	       return c_num; 
		   }		
	}
}
