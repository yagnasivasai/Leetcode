package org.engineering.digest.leetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1twosum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static int[] twopasshash(int[] nums,int target){
        Map<Integer, Integer> numMap = new HashMap<>(); // storing the values
        for (int i =0; i<nums.length;i++){              // looping the arraylist
            int diff = target - nums[i];
            if (numMap.containsKey(diff)){
                return new int[]{numMap.get(diff),i};
            }
            numMap.put(nums[i],i);
            System.out.println(List.of(numMap));
        }
        return null;

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twopasshash(nums, target)));
    }
}
