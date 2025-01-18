package org.engineering.digest;

public class gcdOfStrings {

//    public static String gcdOfStrings(String str1, String str2) {
//        if (str1.equals(str2)){
//            return str1;
//        }
//        if (str2.length()>str1.length()){
//            return gcdOfStrings(str2,str1);
//        }
//        if (str1.startsWith(str2)){
//            return gcdOfStrings(str1.substring(str2.length()),str2);
//        }
//        return null;
//    }

//    public static String gcdOfStringsRecursive(String str1, String str2) {
//        if (str1.equals(str2)) {
//            return str1;
//        } else if (str1.length() > str2.length()) {
//            return gcdOfStringsRecursive(str1.substring(str2.length()), str2);
//        } else {
//            return gcdOfStringsRecursive(str1, str2.substring(str1.length()));
//        }
//    }

    public static String gcdofStringsCompare(String str1,String str2){
        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str1.length() > str2.length() ? str2 : str1;

        if (bigger.equals(smaller)){
            return smaller;
        }
        if (!bigger.startsWith(smaller)){
            return "";
        }
        String understand = bigger.substring(smaller.length());
        System.out.println(understand);
        return gcdofStringsCompare(bigger.substring(smaller.length()),smaller);
    }



    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABCABCABC";
        String test = "ILOVEYOU";
//        System.out.println(test.substring(6));
//        System.out.println(gcdOfStrings(str1,str2));
//        System.out.println(gcdOfStringsRecursive(str1,str2));
        System.out.println(gcdofStringsCompare(str1,str2));
    }
}


//For two strings s and t, we say "t divides s"
// if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"

//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"

//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
//
//
//Constraints:
//
//        1 <= str1.length, str2.length <= 1000
//str1 and str2 consist of English uppercase letters.
