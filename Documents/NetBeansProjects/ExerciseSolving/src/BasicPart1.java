
import java.nio.charset.Charset;
import java.util.Scanner;
import java.io.Console;
import java.io.File;
import java.text.SimpleDateFormat;
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
public class BasicPart1 {
    public static void main(String[] args){
        Number1();
    }
    
    
    public static void Number1(){
        System.out.println("1. Write a Java program to print 'Hello' on screen and then print your name on a separate line\n" +
                            "Expected Output :\n" +
                            "Hello \n" +
                            "Alexandra Abramov");
        System.out.println("");
        System.out.println("Answer:");
        System.out.println("Hello");
        System.out.println("Alexandra Abramov");
    }
    
    public static void Number2(){
        System.out.println("Write a Java program to print the sum of two numbers \n" +
                            "Test Data: \n" +
                            "74 + 36 \n" +
                            "Expected Output :\n" +
                            "110");
        System.out.println("");
        System.out.println("Answer:");
        System.out.println(74+36);
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program to divide two numbers and print on the screen \n" +
                            "Test Data : \n" +
                            "50/3\n" +
                            "Expected Output :\n" +
                            "16");
        System.out.println("");
        System.out.println("Answer");
        System.out.println(50/3);
    }
    
    public static void Number4(){
        System.out.println("4. Write a Java program to print the result of the following operations \n" +
                            "Test Data:\n" +
                            "a. -5 + 8 * 6\n" +
                            "b. (55+9) % 9 \n" +
                            "c. 20 + -3*5 / 8 \n" +
                            "d. 5 + 15 / 3 * 2 - 8 % 3 \n" +
                            "Expected Output :\n" +
                            "43 \n" +
                            "1 \n" +
                            "19 \n" +
                            "13");
        int a = (-5)+(8*6);
        int b = (55+9)%9;
        int c = 20+((-3*5)/8);
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("");
        System.out.println("Answer:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
    public static void Number5(){
        Scanner in = new Scanner(System.in);
        System.out.println("5. Write a Java program that takes two numbers as input and display the product of two numbers.\n" +
                            "Test Data:\n" +
                            "Input first number: 25\n" +
                            "Input second number: 5\n" +
                            "Expected Output :\n" +
                            "25 x 5 = 125");
        System.out.println("");
        System.out.println("Input the first number: ");
        int first = in.nextInt();
        System.out.println("Input the second number: ");
        int second = in.nextInt();
        
        System.out.println("Answer:");
        System.out.println(first+" x "+second+" = "+first*second);
    }
    
    public static void Number6(){
        Scanner in = new Scanner(System.in);
        System.out.println("6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.\n" +
                            "Test Data:\n" +
                            "Input first number: 125\n" +
                            "Input second number: 24\n" +
                            "Expected Output :\n" +
                            "125 + 24 = 149\n" +
                            "125 - 24 = 101\n" +
                            "125 x 24 = 3000\n" +
                            "125 / 24 = 5\n" +
                            "125 mod 24 = 5");
        System.out.println("");
        System.out.println("Input the first number: ");
        int first = in.nextInt();
        System.out.println("Input the second number: ");
        int second = in.nextInt();
        System.out.println("Answer:");
        System.out.println(first+" + "+second+" = "+(first+second));
        System.out.println(first+" - "+second+" = "+(first-second));
        System.out.println(first+" x "+second+" = "+(first*second));
        System.out.println(first+" / "+second+" = "+(first/second));
        System.out.println(first+" mod "+second+" = "+(first%second));
    }
    
    public static void Number7(){
        Scanner in = new Scanner(System.in);
        System.out.println("7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor\n" +
                            "Test Data:\n" +
                            "Input a number: 8\n" +
                            "Expected Output :\n" +
                            "8 x 1 = 8\n" +
                            "8 x 2 = 16\n" +
                            "8 x 3 = 24\n" +
                            "...\n" +
                            "8 x 10 = 80");
        System.out.println("");
        System.out.println("Input the number: ");
        int number = in.nextInt();
        System.out.println("Answer:");
        for(int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
        
    }
      
    public static void Number8(){
        System.out.println("8. Write a Java program to display the following pattern.\n" +
                            "Sample Pattern : \n" +
                            "   J    a   v     v  a                                                  \n" +
                            "   J   a a   v   v  a a                                                 \n" +
                            "J  J  aaaaa   V V  aaaaa                                                \n" +
                            " JJ  a     a   V  a     a");
        System.out.println("");
        System.out.println("Answer:");
        System.out.println("   J    a   v     v  a  ");
        System.out.println("   J   a a   v   v  a a   ");
        System.out.println("J  J  aaaaa   V V  aaaaa   ");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void Number9(){
        System.out.println("9. Write a Java program to compute the specified expressions and print the output.\n" +
                            "Test Data:\n" +
                            "((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) \n" +
                            "Expected Output\n" +
                            "2.138888888888889");
        System.out.println("");
        System.out.println("Answer:");
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
    
    public static void Number10(){
        System.out.println("10. Write a Java program to compute a specified formula.\n" +
                            "Specified Formula : \n" +
                            "4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))\n" +
                            "Expected Output\n" +
                            "2.9760461760461765");
        double number = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println("");
        System.out.println("Answer:");
        System.out.println(number);
    }
    
    public static void Number11(){
        System.out.println("11. Write a Java program to print the area and perimeter of a circle.\n" +
                            "Test Data:\n" +
                            "Radius = 7.5 \n" +
                            "Expected Output\n" +
                            "Perimeter is = 47.12388980384689 \n" +
                            "Area is = 176.71458676442586 ");
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius*radius);
        System.out.println("");
        System.out.println("Answer:");
        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is = "+area);
    }
    
    public static void Number12 (){
        Scanner in = new Scanner(System.in);
        System.out.println("Write a Java program that takes three numbers as input to calculate and print the average of the numbers.");
        System.out.println("");
        double x = 1;
        double number = 0;
        while(x<=4){
            System.out.println("Input number "+(int)x);
            number += in.nextInt();
            x += 1;
        }
        double avg = (number/(x-1));
        System.out.println("Average Result = "+avg);
        System.out.println("Average Result = "+x);
        System.out.println("Average Result = "+number);
    }
    
    public static void Number13(){
        System.out.println("13. Write a Java program to print the area and perimeter of a rectangle.\n" +
                            "Test Data:\n" +
                            "Width = 5.6 Height = 8.5 \n" +
                            "Expected Output\n" +
                            "Area is 5.6 * 8.5 = 47.60\n" +
                            "Perimeter is 2 * (5.6 + 8.5) = 28.20 ");
        double width = 5.6;
        double height = 8.5;
        double area = (width*height);
        double perimeter = 2*(width+height);
        System.out.println("");
        System.out.println("Answer: ");
        System.out.println("Area is "+width+" * "+height+" = "+area);
        System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+perimeter);
    }
        
    public static void Number14(){
        System.out.println("14. Write a Java program to print an American flag on the screen.\n" +
                            "Expected Output\n" +
                            "* * * * * * ==================================                          \n" +
                            " * * * * *  ==================================                          \n" +
                            "* * * * * * ==================================                          \n" +
                            " * * * * *  ==================================                          \n" +
                            "* * * * * * ==================================                          \n" +
                            " * * * * *  ==================================                          \n" +
                            "* * * * * * ==================================                          \n" +
                            " * * * * *  ==================================                          \n" +
                            "* * * * * * ==================================                          \n" +
                            "==============================================                          \n" +
                            "==============================================                          \n" +
                            "==============================================                          \n" +
                            "==============================================                          \n" +
                            "==============================================                          \n" +
                            "==============================================");
        String line1 = "* * * * * *  ================================ \n"+
                        " * * * * *   ================================";
        String line2 = "=============================================";
        System.out.println("");
        for( int i=0;i<4;i++){
            System.out.println(line1);
        }
        for (int i=0;i<6;i++){
            System.out.println(line2);
        }
    }
    
    public static void Number15(){
        Scanner in = new Scanner(System.in);
        System.out.println("15. Write a Java program to swap two variables.\n");
        System.out.println("");
        int x, y, z;
        System.out.println("Input First Number: ");
        x = in.nextInt();
        System.out.println("Input Second Number: ");
        y = in.nextInt();
            z = x;
            x = y;
            y = z;
        System.out.println("Swapped Number= "+x+" and "+y);
    }
        
    public static void Number16(){
            System.out.println("16. Write a Java program to print a face. \n" +
                                "Expected Output\n" +
                                " +\"\"\"\"\"+                                                 \n" +
                                "[| o o |]                                                \n" +
                                " |  ^  |                                                 \n" +
                                " | '-' |                                                 \n" +
                                " +-----+");
        String[] face = new String[5];
        face[0] = " +\"\"\"\"\"+";
        face[1] = "[| o o |]";
        face[2] = " |  ^  | ";
        face[3] = " | '-' | ";
        face[4] = " +-----+ ";
        System.out.println("");
        for(int i=0;i<face.length;i++){
            System.out.println(face[i]);
        }
    }
       
    public static void Number17(){
        System.out.println("17. Write a Java program to add two binary numbers.\n" +
                            "Input Data:\n" +
                            "Input first binary number: 10 \n" +
                            "Input second binary number: 11\n" +
                            "Expected Output\n" +
                            "Sum of two binary numbers: 101\n");
        System.out.println("");
                long binary1, binary2;
                int i = 0, remainder = 0;
                int[] sum = new int[20];
                Scanner in = new Scanner(System.in);

                System.out.print("Input first binary number: ");
                binary1 = in.nextLong();
                System.out.print("Input second binary number: ");
                binary2 = in.nextLong();

                while (binary1 != 0 || binary2 != 0) 
                {
                 sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
                 remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
                 binary1 = binary1 / 10;
                 binary2 = binary2 / 10;
                }
                if (remainder != 0) {
                 sum[i++] = remainder;
                }
                --i;
                System.out.print("Sum of two binary numbers: ");
                while (i >= 0) {
                 System.out.print(sum[i--]);
                }
                 System.out.print("\n");
    }
        
    public static void Number18(){
        System.out.println("18. Write a Java program to multiply two binary numbers.\n" +
                            "Input Data:\n" +
                            "Input the first binary number: 10 \n" +
                            "Input the second binary number: 11 \n" +
                            "Expected Output\n" +
                            "Product of two binary numbers: 110 ");
        System.out.println("");
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();
        while (binary2 != 0)
        {
         digit = (int)(binary2 % 10);
         if (digit == 1) 
         {
          binary1 = binary1 * factor;
          multiply = binaryproduct((int) binary1, (int) multiply);
         } 
         else
         {
          binary1 = binary1 * factor;
         }
         binary2 = binary2 / 10;
         factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply+"\n");
       }
       static int binaryproduct(int binary1, int binary2) 
       {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) 
        {
         sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
         remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
         binary1 = binary1 / 10;
         binary2 = binary2 / 10;
        }
        if (remainder != 0)
        {
         sum[i++] = remainder;
        }
        --i;
        while (i >= 0) 
        {
         binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }
        
    public static void Number19(){
        System.out.println("19. Write a Java program to convert a decimal number to binary number.\n" +
                            "Input Data:\n" +
                            "Input a Decimal Number : 5\n" +
                            "Expected Output\n" +
                            "Binary number is: 101 ");
        System.out.println("");
        int dec_num, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
        
    public static void Number20(){
        System.out.println("20. Write a Java program to convert a decimal number to hexadecimal number. \n" +
                            "Input Data:\n" +
                            "Input a decimal number: 15\n" +
                            "Expected Output\n" +
                            "Hexadecimal number is : F ");
        System.out.println("");
        int dec_num, rem;
        String hexdec_num="";
        
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");    
    }
        
    public static void Number21(){
        System.out.println("21. Write a Java program to convert a decimal number to octal number. \n" +
                            "Input Data:\n" +
                            "Input a Decimal Number: 15 \n" +
                            "Expected Output\n" +
                            "Octal number is: 17  ");
        System.out.println("");
        int dec_num, rem, quot, i=1, j;
        int oct_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
            oct_num[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct_num[j]);
        }
		System.out.print("\n");
    }
        
    public static void Number22(){
        System.out.println("22. Write a Java program to convert a binary number to decimal number. \n" +
                            "Input Data:\n" +
                            "Input a binary number: 100\n" +
                            "Expected Output\n" +
                            "Decimal Number: 4 ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0) 
        {
         remainder = binaryNumber % 10;
         decimalNumber = decimalNumber + remainder * j;
         j = j * 2;
         binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    }
        
    public static void Number23(){
        System.out.println("23. Write a Java program to convert a binary number to hexadecimal number. \n" +
                            "Input Data:\n" +
                            "Input a Binary Number: 1101 \n" +
                            "Expected Output\n" +
                            "HexaDecimal value: D");
        System.out.println("");
        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, bin;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        bin = in.nextInt();
        while (bin > 0) {
         rem = bin % 2;
         dec = dec + rem * i;
         i = i * 2;
         bin = bin / 10;
        }
         i = 0;
        while (dec != 0) {
         hex[i] = dec % 16;
         dec = dec / 16;
         i++;
        }
        System.out.print("HexaDecimal value: ");
        for (j = i - 1; j >= 0; j--)
        {
         if (hex[j] > 9) 
         {
          System.out.print((char)(hex[j] + 55)+"\n");
         } else
         {
          System.out.print(hex[j]+"\n");
         }
        }
    }
        
    public static void Number24(){
        System.out.println("24. Write a Java program to convert a binary number to a Octal number.\n" +
                            "Input Data:\n" +
                            "Input a Binary Number: 111 \n" +
                            "Expected Output\n" +
                            "Octal number: 7 ");
        System.out.println("");
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
        while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Octal Number :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.print("\n");
    }
        
    public static void Number25(){
        System.out.println("25. Write a Java program to convert a octal number to a decimal number.\n" +
                        "Input Data:\n" +
                        "Input any octal number: 10 \n" +
                        "Expected Output\n" +
                        "Equivalent decimal number: 8");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        long octal_num, decimal_num = 0;
        int i = 0;
        System.out.print("Input any octal number: ");
        octal_num = in.nextLong();
        while (octal_num != 0) 
        {
         decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
         octal_num = octal_num / 10;
        }
        System.out.print("Equivalent decimal number: " + decimal_num+"\n");
    }
        
    public static void Number26(){
        System.out.println("26. Write a Java program to convert a octal number to a binary number. \n" +
                            "Input Data:\n" +
                            "Input any octal number: 7 \n" +
                            "Expected Output\n" +
                            "Equivalent binary number: 111");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        long octal_num, tempoctal_num, binary_num, place;
        int rem;
        System.out.print("Input any octal number: ");
        octal_num = in.nextLong();
        tempoctal_num = octal_num;
        binary_num = 0;
        place = 1;
        while (tempoctal_num != 0)
        {
         rem = (int)(tempoctal_num % 10);
         binary_num = octal_numvalues[rem] * place + binary_num;
         tempoctal_num /= 10;
         place *= 1000;
        }
        System.out.print("Equivalent binary number: " + binary_num+"\n");
    }
    
    public static void Number27(){
        System.out.println("27. Write a Java program to convert a octal number to a hexadecimal number. \n" +
                            "Input Data:\n" +
                            "Input a octal number : 100 \n" +
                            "Expected Output\n" +
                            "Equivalent hexadecimal number: 40");
        System.out.println("");
        String octal_num, hex_num;
        int decnum;
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a octal number : ");
        octal_num = in.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
    }
    
    public static void Number28(){
        System.out.println("28. Write a Java program to convert a hexadecimal to a decimal number. Go to the editor\n" +
                            "Input Data:\n" +
                            "Input a hexadecimal number: 25\n" +
                            "Expected Output\n" +
                            "Equivalent decimal number is: 37");
        System.out.println("");
        String hexdec_num;
        int dec_num;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();
		
        dec_num = hex_to_decimal(hexdec_num);
		
        System.out.print("Equivalent decimal number is: " + dec_num+"\n");
    }
            public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    
    }
    
    public static void Number29(){
        System.out.println("29. Write a Java program to convert a hexadecimal to a binary number. \n" +
                            "Input Data:\n" +
                            "Enter Hexadecimal Number : 37\n" +
                            "Expected Output\n" +
                            "Equivalent Binary Number is: 110111");
        System.out.println("");
        String hexdec_num;
        int dec_num, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdec_num = scan.nextLine();
        
        /* convert hexadecimal to decimal */        
        dec_num = hex_to_decimal(hexdec_num);
        
        /* convert decimal to binary */        
        while(dec_num != 0)
        {
            bin_num[i++] = dec_num%2;
            dec_num = dec_num/2;
        }
		
        System.out.print("Equivalent Binary Number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
    
    public static void Number30(){
        System.out.println("30. Write a Java program to convert a hexadecimal to a octal number. \n" +
                            "Input Data:\n" +
                            "Input a hexadecimal number: 40\n" +
                            "Expected Output\n" +
                            "Equivalent of octal number is: 100");
        System.out.println("");
        String hexdec_num;
        int dec_num, i=1, j;
        int octal_num[] = new int[100];
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = in.nextLine();
        
        // Convert hexadecimal to decimal
        
        dec_num = hex_to_decimal(hexdec_num);
        
        //Convert decimal to octal
        
        while(dec_num != 0)
        {
            octal_num[i++] = dec_num%8;
            dec_num = dec_num/8;
        }
		
        System.out.print("Equivalent of octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal_num[j]);
        }
		System.out.print("\n");
    }
    
    public static void Number31(){
        System.out.println("31. Write a Java program to check whether Java is installed on your computer.\n" +
                            "Expected Output\n" +
                            "Java Version: 1.8.0_71                                                            \n" +
                            "Java Runtime Version: 1.8.0_71-b15                                                \n" +
                            "Java Home: /opt/jdk/jdk1.8.0_71/jre                                               \n" +
                            "Java Vendor: Oracle Corporation                                                   \n" +
                            "Java Vendor URL: http://Java.oracle.com/                                          \n" +
                            "Java Class Path: .");
        System.out.println("");
        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
    }
    
    public static void Number32(){
        System.out.println("32. Write a Java program to compare two numbers. \n" +
                            "Input Data:\n" +
                            "Input first integer: 25\n" +
                            "Input second integer: 39\n" +
                            "Expected Output\n" +
                            "25 != 39                                                                          \n" +
                            "25 < 39                                                                           \n" +
                            "25 <= 39");
        System.out.println("");
              
        Scanner input = new Scanner(System.in);
        int number1;       
        int number2; 
      
        System.out.print( "Input first integer: " );        
        number1 = input.nextInt();   
 
        System.out.print( "Input second integer: " );        
        number2 = input.nextInt();             
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 ); 
    }
    
    public static void Number33(){
        System.out.println("33. Write a Java program and compute the sum of the digits of an integer. Go to the editor\n" +
                            "Input Data:\n" +
                            "Input an integer: 25\n" +
                            "Expected Output\n" +
                            "The sum of the digits is: 7");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));

    }
        public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void Number34(){
        System.out.println("34. Write a Java program to compute the area of a hexagon. \n" +
                            "Area of a hexagon = (6 * s^2)/(4*tan(π/6))\n" +
                            "where s is the length of a side\n" +
                            "Input Data:\n" +
                            "Input the length of a side of the hexagon: 6\n" +
                            "Expected Output\n" +
                            "The area of the hexagon is: 93.53074360871938");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = input.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
    }
        public static double hexagonArea(double s) {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
    }
    
    public static void Number35(){
        System.out.println("35. Write a Java program to compute the area of a polygon.\n" +
                            "Area of a polygon = (n*s^2)/(4*tan(π/n))\n" +
                            "where n is n-sided polygon and s is the length of a side\n" +
                            "Input Data:\n" +
                            "Input the number of sides on the polygon: 7\n" +
                            "Input the length of one of the sides: 6\n" +
                            "Expected Output\n" +
                            "The area is: 130.82084798405722");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int ns = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side)+"\n");
    }
         public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
    
    public static void Number36(){
        System.out.println("36. Write a Java program to compute the distance between two points on the surface of earth.\n" +
                            "Distance between the two points [ (x1,y1) & (x2,y2)]\n" +
                            "d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))\n" +
                            "Radius of the earth r = 6371.01 Kilometers\n" +
                            "Input Data:\n" +
                            "Input the latitude of coordinate 1: 25 \n" +
                            "Input the longitude of coordinate 1: 35\n" +
                            "Input the latitude of coordinate 2: 35.5\n" +
                            "Input the longitude of coordinate 2: 25.5\n" +
                            "Expected Output\n" +
                            "The distance between those points is: 1480.0848451069087 km ");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = input.nextDouble();

        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
    }
        public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }
    
    public static void Number37(){
        System.out.println("37. Write a Java program to reverse a string. \n" +
                            "Input Data:\n" +
                            "Input a string: The quick brown fox \n" +
                            "Expected Output\n" +
                            "Reverse string: xof nworb kciuq ehT\n" +
                            "Click me to see the solution");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
    
    public static void Number38(){
        System.out.println("38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.\n" +
                            "Expected Output\n" +
                            "The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33\n" +
                            "letter: 23                                               \n" +
                            "space: 9                                                 \n" +
                            "number: 10                                               \n" +
                            "other: 6");
        System.out.println("");
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
    }
    
    public static void Number39(){
        System.out.println("39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. \n" +
                            "Expected Output\n" +
                            "123                                                      \n" +
                            "124                                                      \n" +
                            "...                                            \n" +
                            "                                                   \n" +
                            "431                                                      \n" +
                            "432                                                      \n" +
                            "Total number of the three-digit-number is 24");
        System.out.println("");
        int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
    }
    
    public static void Number40(){
        System.out.println("40. Write a Java program to list the available character sets in charset objects.\n" +
                        "Expected Output\n" +
                        "List of available character sets:                                       \n" +
                        "Big5                                                                    \n" +
                        "Big5-HKSCS                                                              \n" +
                        "CESU-8                                                                  \n" +
                        "EUC-JP                                                                  \n" +
                        "EUC-KR                                                                  \n" +
                        "GB18030                                                                 \n" +
                        "GB2312                                                                  \n" +
                        "GBK                                                                     \n" +
                        "                                                     \n" +
                        "...                                            \n" +
                        "                                                   \n" +
                        "x-SJIS_0213                                                             \n" +
                        "x-UTF-16LE-BOM                                                          \n" +
                        "X-UTF-32BE-BOM                                                          \n" +
                        "X-UTF-32LE-BOM                                                          \n" +
                        "x-windows-50220                                                         \n" +
                        "x-windows-50221                                                         \n" +
                        "x-windows-874                                                           \n" +
                        "x-windows-949                                                           \n" +
                        "x-windows-950                                                           \n" +
                        "x-windows-iso2022jp");
        System.out.println("");
        System.out.println("List of available character sets: ");  
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
    
    public static void Number41(){
        System.out.println("41. Write a Java program to print the ascii value of a given character. \n" +
                            "Expected Output\n" +
                            "The ASCII value of Z is :90");
        System.out.println("");
        int chr = 'Z';
	System.out.println("The ASCII value of Z is :"+chr);
    }
    
    public static void Number42(){
        System.out.println("42. Write a Java program to input and display your password. \n" +
                            "Expected Output\n" +
                            "Input your Password:                                                    \n" +
                            "Your password was: abc@123");
        System.out.println("");
        Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
    }
    
    public static void Number43(){
        System.out.println("43. Write a Java program to print the following string in a specific format (see the output). \n" +
                            "Sample Output\n" +
                            "Twinkle, twinkle, little star,\n" +
                            "	How I wonder what you are! \n" +
                            "		Up above the world so high,   		\n" +
                            "		Like a diamond in the sky. \n" +
                            "Twinkle, twinkle, little star, \n" +
                            "	How I wonder what you are");
        System.out.println("");
        System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are\n\n");
    }

    public static void Number44(){
        System.out.println("44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. \n" +
                            "Sample Output: \n" +
                            "Input number: 5                                                        \n" +
                            "5 + 55  + 555");
        System.out.println("");
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        n = in .nextInt();
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }

    public static void Number45(){
        System.out.println("45. Write a Java program to find the size of a specified file. \n" +
                            "Sample Output: \n" +
                            "/home/students/abc.txt  : 0 bytes                                      \n" +
                            "/home/students/test.txt : 0 bytes ");
        System.out.println("");
        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
    }

    public static void Number46(){
        System.out.println("46. Write a Java program to display the system time. \n" +
                            "Sample Output: \n" +
                            "Current Date time: Fri Jun 16 14:17:40 IST 2017 ");
        System.out.println("");
        System.out.format("Current Date time: %tc%n\n", System.currentTimeMillis());
    }

    public static void Number47(){
        System.out.println("47. Write a Java program to display the current date time in specific format.\n" +
                            "Sample Output: \n" +
                            "Now: 2017/06/16 08:52:03.066 ");
        System.out.println("");
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("Now: "+cdt.format(System.currentTimeMillis()));
    }

    public static void Number48(){
        System.out.println("48. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.\n" +
                            "Sample Output: \n" +
                            "1                                                                      \n" +
                            "3                                                                      \n" +
                            "5                                                                      \n" +
                            "7                                                                      \n" +
                            "9                                                                      \n" +
                            "11                                                                     \n" +
                            "....                                                                     \n" +
                            "                                                                    \n" +
                            "91                                                                     \n" +
                            "93                                                                     \n" +
                            "95                                                                     \n" +
                            "97                                                                     \n" +
                            "99 ");
        System.out.println("");
        for (int i=0;i<100;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void Number49(){
        Scanner in = new Scanner(System.in);
        System.out.println("49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.\n" +
                            "Sample Output: \n" +
                            "Input a number: 20                                                     \n" +
                            "1");
        System.out.println("");
        System.out.println("Input a number: ");
        int number = in.nextInt();
        if(number%2!=0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }

    public static void Number50(){
        System.out.println("50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. \n" +
                            "Sample Output: \n" +
                            "Divided by 3:                                                          \n" +
                            "3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57\n" +
                            ", 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              \n" +
                            "                                                                       \n" +
                            "Divided by 5:                                                          \n" +
                            "5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, \n" +
                            "95,                                                                    \n" +
                            "                                                                       \n" +
                            "Divided by 3 & 5:                                                      \n" +
                            "15, 30, 45, 60, 75, 90,");
        System.out.println("");
        System.out.println("Divided by 3:");
        for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.println(i+", ");
            }
        }
        System.out.println("Divided by 5:");
        for(int i=1;i<100;i++){
            if(i%5==0){
                System.out.println(i+", ");
            }
        }
        System.out.println("Divided by 3 & 5:");
        for(int i=1;i<100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+", ");
            }
        }
    }

    public static void Number51(){
        System.out.println("51. Write a Java program to convert a string to an integer in Java.\n" +
                            "Sample Output: \n" +
                            "Input a number(string): 25                                             \n" +
                            "The integer value is: 25");
        System.out.println("");
        Scanner st = new Scanner(System.in);
        System.out.println("Input a number(string: ");
        String stri = st.nextLine();
        System.out.println("The integer value is: "+Integer.parseInt(stri));
    }    
    
    public static void Number52(){
        System.out.println("52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. \n" +
                            "Sample Output: \n" +
                            "Input the first number : 5                                             \n" +
                            "Input the second number: 10                                            \n" +
                            "Input the third number : 15                                            \n" +
                            "The result is: true");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int first = in.nextInt();
        System.out.println("Input the second number: ");
        int second = in.nextInt();
        System.out.println("Input the third number: ");
        int third = in.nextInt();
        System.out.println("The result is: "+sumResult(first,second,third));
    }
        public static boolean sumResult(int x,int y,int z){
        return((x+y)==z);
        }

}
