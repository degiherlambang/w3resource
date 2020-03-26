
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestArray {
    static int max;
    static int min;
    public static void main(String[]args){
        Number7();
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java program to sort a numeric array and a string array. \n");
        int[] number = { 3, 4, 5, 2, 6, 1, 7, 9, 8};
        String[] str = {"China","Brazil","Denmark","America","Ecuador"};
        System.out.println("Numeric array before sorting: "+Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Numeric array after sorting: "+Arrays.toString(number));
        System.out.println("String array before sorting: "+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("String array after sorting: "+Arrays.toString(str));
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program to sum values of an array. \n");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program to print the following grid. \n" +
                            "Expected Output :\n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - -                                                                                           \n" +
                            "- - - - - - - - - - ");
        int [][]a = new int[10][10];    
        for(int i = 0; i < 10; i++){
             for(int j = 0; j < 10; j++){
                System.out.printf("%2d ", a[i][j]);
             }
             System.out.println();
          }
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java program to calculate the average value of array elements. \n");
        int[] numbers = new int[]{20, 30, 25, 35, 36, 60, 60};
       int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Original Arrays: "+ Arrays.toString(numbers));
        System.out.println("Average value of the array elements is : " + average); 
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program to test if an array contains a specific value. \n");
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
      System.out.println(contains(my_array1, 2013));
      System.out.println(contains(my_array1, 2015));
    }
        public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
        if (item == n) {
        return true;
        }
    }
      return false;
   }
    
    public static void Number6(){
        System.out.println("6. Write a Java program to find the index of an array element. \n");
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 14 is: " + findIndex(my_array, 14));
        System.out.println("Index position of 56 is: " + findIndex(my_array, 56));
    }
        public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
        
    public static void Number7(){
        System.out.println("7. Write a Java program to remove a specific element from an array. \n");
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : "+Arrays.toString(my_array));     
        int removeIndex = 1;
        for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(my_array));
    }
    
    public static void Number8(){
        System.out.println("8. Write a Java program to copy an array by iterating the array. \n");
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];     
        System.out.println("Source Array : "+Arrays.toString(my_array));     
        for(int i=0; i < my_array.length; i++) {
        new_array[i] = my_array[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
    }
    
    public static void Number9(){
        System.out.println("9. Write a Java program to insert an element (specific position) into an array. \n");
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int Index_position = 2;
        int newValue    = 5;
        System.out.println("Original Array : "+Arrays.toString(my_array));     
        for(int i=my_array.length-1; i > Index_position; i--){
        my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
        
    }
    
    public static void Number10(){
        
        System.out.println("");
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
        public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }
    
}
