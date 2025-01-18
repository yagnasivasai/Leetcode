package org.engineering.digest;

public class removeSpaces {

    public static String removeSpace(String string){
        String reversedString = "";
        int length_of_string = string.length();
        for (int i = length_of_string-1 ; i>= 0; i--){
            reversedString = reversedString + string.charAt(i);
            reversedString = reversedString.trim();
        }
        return reversedString;
    }

    public static String removeSpace2(String string){
        String[] words = string.split(" +");//here + means any number of spaces.
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = " hello ";
        String str1 = "    hello    world    killer j ";
        System.out.println(removeSpace(str));
        System.out.println(removeSpace2(str1));


    }
}
