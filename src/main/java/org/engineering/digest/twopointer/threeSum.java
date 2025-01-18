package org.engineering.digest.twopointer;

import java.util.*;

public class threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        System.out.println(Arrays.toString(nums));

        for (int i =0; i < nums.length-2;i++){
            int leftpointer = i+1;
            int rightpointer = nums.length-1;
            while(leftpointer < rightpointer){
                int sum = nums[i] + nums[leftpointer]+ nums[rightpointer];
                if (sum ==0){
                    result.add(Arrays.asList(nums[i],nums[leftpointer],nums[rightpointer]));
                    leftpointer++;
                    rightpointer--;
                    // Skip duplicates for the `leftPointer`
                    while (leftpointer < rightpointer && nums[leftpointer] == nums[leftpointer - 1]) {
                        leftpointer++;
                    }

                    // Skip duplicates for the `rightPointer`
                    while (leftpointer < rightpointer && nums[rightpointer] == nums[rightpointer + 1]) {
                        rightpointer--;
                    }
                }else if (sum < 0){
                    leftpointer++;
                }else {
                    rightpointer--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main (String[]args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);  // Print each triplet
        }
    }
}



/*
Sure! The reason we use nums.length - 2 in the loop condition when iterating through the array
 is to ensure that there are enough elements left to form a valid triplet.

Detailed Explanation:
The goal of the threeSum algorithm is to find triplets of numbers from the array nums
such that the sum of the three numbers is equal to zero. To achieve this, we need to
iterate over the array, and for each element, find two other elements that, when added
together with the current element, sum to zero.

Why nums.length - 2?
Let's break it down:

A triplet consists of three numbers. So, for each fixed element nums[i], you need at
least two other numbers (let's call them nums[left] and nums[right]) to form a valid triplet.

        To form a valid triplet, we need to pick two numbers after the current fixed element nums[i].
        This means that the right pointer (which is used to pick the last element of the triplet) should always be at least 1 index after i, and the left pointer should be strictly after i.

        Therefore, the last index for i (the fixed element) should be nums.length - 3 (
        since the last two elements will be used by the two pointers to form the triplet). This is why we iterate until i < nums.length - 2—because we need at least two more elements after nums[i] to form a valid triplet.

Example Walkthrough:
Consider the example array nums = [-4, -1, -1, 0, 1, 2]:

Fixed element: The first element we consider is nums[i]. We start from i = 0, which means nums[i] = -4.

Two pointers: We use the two-pointer technique, setting left = i + 1 and right = nums.length - 1.
 For i = 0, this means left = 1 and right = 5.

Triplet formation: We will keep adjusting the left and right pointers to find valid triplets.

End of loop: The condition i < nums.length - 2 ensures that we stop the loop when there are fewer than 3 elements left,
 because if i reaches nums.length - 2, there are no valid left and right pointers left to form a triplet.

If we have only 2 elements left, we cannot form a triplet, so we stop iterating before we reach the last two elements.
*/
