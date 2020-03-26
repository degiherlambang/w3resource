/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestString {
    
    public static void main(String[] args){
        Number11();
    }
    
    public static void Number1(){
        System.out.println("1. Write a Java program to get the character at the given index within the String.\n" +
                            "Sample Output: \n" +
                            "Original String = Java Exercises!                                                                             \n" +
                            "The character at position 0 is J                                                                              \n" +
                            "The character at position 10 is i ");
        System.out.println("");
        String str = "Java Exercises!";
        System.out.println("Original String= "+str);
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);
        System.out.println("The character at position 0 is "+(char)index1);
        System.out.println("The character at position 10 is "+(char)index2);
    }
    
    public static void Number2(){
        System.out.println("2. Write a Java program to get the character (Unicode code point) at the given index within the String. \n" +
                            "Sample Output: \n" +
                            "Original String : w3resource.com                                                                              \n" +
                            "Character(unicode point) = 51                                                                                 \n" +
                            "Character(unicode point) = 101 ");
        System.out.println("");
        String str = "w3resource.com";
        System.out.println("Original String : " + str);
        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(9);
        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
    
    public static void Number3(){
        System.out.println("3. Write a Java program to get the character (Unicode code point) before the specified index within the String.\n" +
                            "Sample Output: \n" +
                            "Original String : w3resource.com                                                                              \n" +
                            "Character(unicode point) = 119                                                                                \n" +
                            "Character(unicode point) = 99");
        System.out.println("");
        String str = "w3resource.com";
        System.out.println("Original String : " + str);
        int val1 = str.codePointBefore(1);
        int val2 = str.codePointBefore(9);
        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
    
    public static void Number4(){
        System.out.println("4. Write a java program to count a number of Unicode code points in the specified text range of a String. \n" +
                            "Sample Output: \n" +
                            "Original String : w3rsource.com                                                                               \n" +
                            "Codepoint count = 9");
        System.out.println("");
        String str = "w3rsource.com";
        System.out.println("Original String : " + str);
        int ctr = str.codePointCount(1, 10);
        System.out.println("Codepoint count = " + ctr);
    }
    
    public static void Number5(){
        System.out.println("5. Write a java program to compare two strings lexicographically. \n" +
                            "Sample Output: \n" +
                            "String 1: This is Exercise 1                                                                                  \n" +
                            "String 2: This is Exercise 2                                                                                  \n" +
                            "\"This is Exercise 1\" is less than \"This is Exercise 2\" ");
        System.out.println("");
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        int result = str1.compareTo(str2);
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
    
    public static void Number6(){
        System.out.println("6. Write a java program to compare two strings lexicographically, ignoring case differences. \n" +
                            "Sample Output: \n" +
                            "String 1: This is exercise 1                                                                                  \n" +
                            "String 2: This is Exercise 1                                                                                  \n" +
                            "\"This is exercise 1\" is equal to \"This is Exercise 1\"");
        System.out.println("");
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
    
    public static void Number7(){
        System.out.println("7. Write a Java program to concatenate a given string to the end of another string. \n" +
                            "Sample Output: \n" +
                            "String 1: PHP Exercises and                                                                                   \n" +
                            "String 2: Python Exercises                                                                                    \n" +
                            "The concatenated string: PHP Exercises and Python Exercises");
        System.out.println("");
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        System.out.println("The concatenated string: "+str1.concat(str2));
    }
    
    public static void Number8(){
        System.out.println("8. Write a Java program to test if a given string contains the specified sequence of char values. \n" +
                            "Sample Output: \n" +
                            "Original String: PHP Exercises and Python Exercises                                                           \n" +
                            "Specified sequence of char values: and                                                                        \n" +
                            "true ");
        System.out.println("");
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: "+str1);
        System.out.println("Specified sequence of char values: "+str2);
        System.out.println(str1.contains(str2));
    }
    
    public static void Number9(){
        System.out.println("9. Write a Java program to compare a given string to the specified character sequence. \n" +
                            "Sample Output: \n" +
                            "Comparing example.com and example.com: true                                                                   \n" +
                            "Comparing Example.com and example.com: false");
        System.out.println("");
        String str1 = "example.com"; 
        String str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
        System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
    }   
    
    public static void Number10(){
        System.out.println("10. Write a Java program to compare a given string to the specified string buffer. \n" +
                            "Sample Output: \n" +
                            "Comparing example.com and example.com: true                                                                   \n" +
                            "Comparing Example.com and example.com: false ");
        System.out.println("");
        String str1 = "example.com", str2 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);
        System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
        System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
    }

    public static void Number11(){
        System.out.println("11. Write a Java program to create a new String object with the contents of a character array. \n" +
                            "Sample Output: \n" +
                            "The book contains 234 pages.");
        char[] array = new char[] { '1', '2', '3', '4' };
        String str = String.copyValueOf(array, 1, 3);
        System.out.println("The book contains " + str +" pages.");
    }
}
