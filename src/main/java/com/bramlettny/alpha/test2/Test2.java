package com.bramlettny.alpha.test2;

import java.util.List;

/**
 * Coding task 2. Find subarray with given sum.
 *
 * Given an unsorted array of non-negative integers. Write a function which returns true if there is a continuous subarray
 * which adds to a given number (target sum). Estimate the complexity of your code.
 *
 * Example:
 * Input: [1,2,3,4] and target sum is 7
 * Output: true
 * Explanation: Sum of subarray [3,4] is 7
 */

public class Test2 {

    public static boolean findSubarryWithSum(List<Integer> input, int targetSum) {
        int[] sums = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            int newVal = input.get(i);
            for (int ii = 0; ii < i; ii++) {
                if (sums[ii] + newVal == targetSum) {
                    return true;
                }
                sums[ii] += newVal;
            }
            sums[i] = newVal;
        }
        return false;
    }
}
