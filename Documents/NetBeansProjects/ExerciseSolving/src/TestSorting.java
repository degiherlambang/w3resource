
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
public class TestSorting {
    public static void main(String[] args){
        Number2();
        
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java program to sort an array of given integers using Quick sort Algorithm. Go to the editor\n" +
                            "Quick sort is a comparison sort, meaning that it can sort items of any type for which a \"less-than\" relation (formally, a total order) is defined. ");
        
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program to sort an array of given integers using the Bubble sorting Algorithm.");
        TestSorting ob = new TestSorting();
        int nums[] = {5, 4, 9, 13, -1, 0, 4};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.bubbleSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
        void bubbleSort(int nums[]){
        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1])
                {
                    // swap temp and nums[i]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program to sort an array of given integers using Radix sort Algorithm.");
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java program to sort an array of given integers using Merge sort Algorithm.");
    }
    
    public static void Number5(){
        System.out.println("5. Write a Java program to sort an array of given integers using Heap sort Algorithm.");
    }
}
