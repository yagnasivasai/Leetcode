package org.engineering.digest.leetcode75;

public class mergeAlternately {

    public static String Alternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int min = Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
           result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() > min){
            result.append(word1.substring(min,word1.length()));
        }
        if (word2.length() > min){
            result.append(word2.substring(min,word2.length()));
        }
//        result.append(word1.substring(min)).append(word2.substring(min));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(Alternately("abc","12345"));
    }
}
