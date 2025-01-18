package org.engineering.digest.leetcode75;

public class reverseVowels {

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));

    }

    public static String reverse(String string){
        int n = string.length();
        System.out.println(n);
        char ch[] = string.toCharArray();
        System.out.println(ch);

        int start = 0;
        int end = string.length()-1;
        while (start < end){
            if (!isVowel(ch[start])){
                start = start +1;
            } else if (!isVowel(ch[end])) {
                end = end -1;
            }else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] =temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }


    public static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            return true;
        }
        return false;
    }
}
