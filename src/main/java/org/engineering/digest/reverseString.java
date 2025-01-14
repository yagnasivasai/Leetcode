package org.engineering.digest;

public class reverseString {


    public static String reverse(String str){

        int length_of_string = str.length();
        for (int i = length_of_string-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }
        return "";
    }



    public static void main(String[] args) {

        String str = "hello";
        System.out.println(reverse(str));
    }
}
