package org.engineering.digest;

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



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String..:  ");
        String str = sc.next();
        System.out.println(reverse(str));
    }
}
