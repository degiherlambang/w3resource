
import java.util.Arrays;
import java.util.Collections;
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
public class BasicPart2 {
    public static void main(String[]args){
        Number1();
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java program to find the value of specified expression. \n" +
                            "a) 101 + 0) / 3\n" +
                            "b) 3.0e-6 * 10000000.1\n" +
                            "c) true && true\n" +
                            "d) false && true\n" +
                            "e) (false && false) || (true && true)\n" +
                            "f) (false || false) && (true && true)\n" +
                            "Expected Output :\n" +
                            "(101 + 0) / 3)-> 33\n" +
                            "(3.0e-6 * 10000000.1)-> 30.0000003\n" +
                            "(true && true)-> true\n" +
                            "(false && true)-> false\n" +
                            "((false && false) || (true && true))-> true\n" +
                            "(false || false) && (true && true)-> false");
        int r1 = (101 + 0) / 3;
		double r2 = 3.0e-6 * 10000000.1;
		boolean r3 = true && true;
		boolean r4 = false && true;
		boolean r5 = (false && false) || (true && true);
		boolean r6 = (false || false) && (true && true);
		System.out.println("");
		System.out.println("(101 + 0) / 3)-> " + r1);
		System.out.println("(3.0e-6 * 10000000.1)-> " + r2);
		System.out.println("(true && true)-> " + r3);
		System.out.println("(false && true)-> " + r4);
		System.out.println("((false && false) || (true && true))-> " + r5);
		System.out.println("(false || false) && (true && true)-> " + r6);
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. \n" +
                            "Sample Output:\n" +
                            "Input first number: 25\n" +
                            "Input second number: 37\n" +
                            "Input third number: 45\n" +
                            "Input fourth number: 23\n" +
                            "Numbers are not equal!");
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
	System.out.print("Input third number: ");
        int num3 = in.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();		
            if (num1 == num2 && num2 == num3 && num3 == num4) {
            	System.out.println("Numbers are equal.");
            }else{
		System.out.println("Numbers are not equal!");
		}
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise. \n" +
                            "Sample Output:\n" +
                            "Input first number: 5\n" +
                            "Input second number: 1\n" +
                            "false");
        Scanner in = new Scanner(System.in);
	System.out.print("Input first number: ");
        double n1 = in.nextDouble();
        System.out.print("Input second number: ");
        double n2 = in.nextDouble();
	System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false. \n" +
                            "Sample array:\n" +
                            "array = {{true, false, true},\n" +
                            "{false, true, false}};\n" +
                            "Expected Output :\n" +
                            "t f t \n" +
                            "f t f ");
        boolean[][] array = {{true, false, true},{false, true, false}};
		int rows_length = array.length;
		int columns_length = array[0].length;
		for (int i = 0; i < rows_length; i++) {
			for (int j = 0; j < columns_length; j++) {
				if (array[i][j]) {
					System.out.print(" t ");
				} else {
					System.out.print(" f ");
				}
                            }
			System.out.println();
		}	
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program to print an array after changing the rows and columns of a given two-dimensional array. \n" +
                            "Original Array:\n" +
                            "10 20 30\n" +
                            "40 50 60 \n" +
                            "After changing the rows and columns of the said array:10 40 \n" +
                            "20 50 \n" +
                            "30 60 ");
                int[][] twodm = {{10, 20, 30},
				{40, 50, 60}};
		System.out.print("Original Array:\n");
		print_array(twodm);
		System.out.print("After changing the rows and columns of the said array:");
		transpose(twodm);
		}
	    private static void transpose(int[][] twodm) {
		
		int[][] newtwodm = new int[twodm[0].length][twodm.length];
		
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}
		
		print_array(newtwodm);
	}
            private static void print_array(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}
	
	}
    
    public static void Number6(){
        System.out.println("6. Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer. \n" +
                            "Original Number: 2350\n" +
                            "Result: 115");
        int n = 2350;
		System.out.printf("Original Number: %d\n", n);
		int shift_right_count = 0;
        do {
            n >>= 1;
            shift_right_count++;
        } while (n != 0);
         shift_right_count--;
        System.out.printf("Result: %s\r\n", shift_right_count);
        
    }
    
    public static void Number7(){
        System.out.println("7. Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor of two positive given integers. \n" +
                "According to Wikipedia \"The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced"+ 
                "by its difference with the smaller number. For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5), and the same number 21 is also the GCD"+ 
                "of 105 and 252 − 105 = 147. Since this replacement reduces the larger of the two numbers, repeating this process gives successively smaller pairs of numbers until"+ 
                "the two numbers become equal. When that occurs, they are the GCD of the original two numbers. By reversing the steps, the GCD can be expressed as a sum of the two"+
                "original numbers each multiplied by a positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252. The fact that the GCD can always be expressed in this way is known as Bézout's identity.\"\n" +
                "Expected Output:\n" +
                "result: 24\n" +
                "result: 1");
                System.out.println("result: " + euclid(48, 24));
		System.out.println("result: " + euclid(125463, 9658));
    }
        public static int euclid(int x, int y) {
		if (x == 0 || y == 0) {
			return 1;
		}
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x % y == 0) {
			return y;
		} else {
			return euclid(y, x % y);
		}
	}
    
    public static void Number8(){
        System.out.println("8. Write a Java program to create a two-dimension array (m x m) A[][] such that A[i][j] is true if I and j are prime and have no common factors, otherwise A[i][j] becomes false. \n" +
                            "Sample Output: \n" +
                            "true true true \n" +
                            "true true true \n" +
                            "true true false ");
        int n = 3;
		boolean[][] A = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = prime_cell(i, j) == 1;
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
    }
        public static int prime_cell(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		}
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a % b == 0) 
		{
			return b;
		} 
		else 
		{
			return prime_cell(b, a % b);
		}
	}
    
    public static void Number9(){
        System.out.println("9. Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order. \n" +
                            "Expected Output:\n" +
                            "Original Array: \n" +
                            "[1, 4, 17, 7, 25, 3, 100]\n" +
                            "3 largest elements of the said array are:\n" +
                            "100 25 17 ");
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k +" largest elements of the said array are:");
        Arrays.sort(arr, Collections.reverseOrder());         
       for (int i = 0; i < k; i++) 
          System.out.print(arr[i] + " ");
    }
    
    public static void Number10(){
        System.out.println("10. Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order. \n" +
                            "Expected Output:\n" +
                            "Original Array: \n" +
                            "[1, 4, 17, 7, 25, 3, 100]\n" +
                            "3 largest elements of the said array are:\n" +
                            "100 25 17 ");
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k + " smallest elements of the said array are:");
        Arrays.sort(arr);
        for (int i = 0; i < k; i++)
        System.out.print(arr[i] + " ");
    }
}
