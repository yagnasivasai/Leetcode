package org.engineering.digest.leetcode75;

import java.util.Scanner;

public class reverseString {


    public static String reverse(String str){
        String reversedString = "";
        int length_of_string = str.length();
        for (int i = length_of_string-1; i>=0; i--){
            reversedString = reversedString + str.charAt(i);
//            System.out.println(str.charAt(i));
        }
        return reversedString;
    }
    public  static String asciicode(String str){
        for (int i =0; i < str.length();i++){
            char c = str.charAt(i);
            System.out.println(c + " " + (int)c);
        }
        return "";
    }

    public  static String UpperCase(String str){
        for (int i =0; i < str.length();i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                System.out.print(c);
        }
        System.out.println(); // Move to the next line after printing all uppercase characters
        return "";
    }
    public  static String UpperCaseCount(String str){
        int count = 0;
        for (int i =0; i < str.length();i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                count = count +1;
        }
        System.out.println(count+"Upper"); // Move to the next line after printing all uppercase characters
        return "";
    }

    public  static String LowerCase(String str){
        for (int i =0; i < str.length();i++){
            char c = str.charAt(i);
            if (Character.isLowerCase(c))
                System.out.print(c);
        }
        System.out.println(); // Move to the next line after printing all lowercase characters
        return "";
    }

    public  static String LowerCaseCount(String str){
        int count = 0;
        for (int i =0; i < str.length();i++){
            char c = str.charAt(i);
            if (Character.isLowerCase(c))
                count = count +1;
//                System.out.print(c);
        }
        System.out.println("Lower: " + count); // Move to the next line after printing all lowercase characters
        return "";
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String..:  ");
        String str = sc.next();
        System.out.println(reverse(str));
//        asciicode(str);
        UpperCase(str);
        LowerCase(str);
        UpperCaseCount(str);
    }
}
