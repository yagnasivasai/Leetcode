package org.engineering.digest.twopointer;

import java.util.Arrays;

public class sumOf {
    public static boolean sumof(int[] arr, int target){
        int leftpointer = 0;
        int rightpointer = arr.length-1;

        while(leftpointer < rightpointer){
//            int currentSum = arr[leftpointer]+arr[rightpointer];
            if (target == arr[leftpointer]+arr[rightpointer]){
                return true;
            } else if (arr[leftpointer]+arr[rightpointer] < target) {
                leftpointer++;
            }else {
                rightpointer--;
            }

        }
        return false;
    }

    public static int[] sumofint(int[] arr, int target){
        int leftpointer = 0;
        int rightpointer = arr.length-1;

        while(leftpointer < rightpointer){
//            int currentSum = arr[leftpointer]+arr[rightpointer];
            if (target == arr[leftpointer]+arr[rightpointer]){
                return new int[]{arr[leftpointer],arr[rightpointer]};
            } else if (arr[leftpointer]+arr[rightpointer] < target) {
                leftpointer++;
            }else {
                rightpointer--;
            }

        }
        return null;
    }
    public static int[] twoSum(int[] arr, int target) {
        int leftpointer =0;
        int rightpointer = arr.length-1;

        while(leftpointer < rightpointer){
            int currentSum = arr[leftpointer] + arr[rightpointer];
            if(target == currentSum ){
                return new int[] {leftpointer+1, rightpointer+1};
            } else if(currentSum < target){
                leftpointer++;
            } else{
                rightpointer--;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 35, 50, 60, 80, 100}, target =150;
        System.out.println(sumof(arr,target));
        System.out.println(Arrays.toString(sumofint(arr, target)));
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
