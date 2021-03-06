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

    /**
     * Determines if there is a continuous subarray whose sum is equal to the specified target sum.
     *
     * Complexity:
     *
     *  this approach keeps a running sum of sub-arrays so as it iterates over the input data it does a second
     *  loop over the sub-arrays. I believe this approach makes the complexity O squared. While I could reduce the
     *  iterations of the inner array (tossing values when they are above the targetSum) the complexity of that code
     *  doesn't feel worth it given the overall simplicity of the solution - that would be more important for larger
     *  datasets but for smaller ones it isn't worth the cost.
     *
     *  Storage requirements would be 2xn where n is the size of the input list.
     *
     * @param input The set of values we are checking against
     * @param targetSum The target sum we are looking for
     * @return boolean Returns true if we find a continuous subarray whose sum is equal to our target, false otherwise
     */
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

    /**
     * Determines if there is a continuous subarray whose sum is equal to the specified target sum.
     *
     * Complexity:
     * I believe the complexity of this would be considered O as there is basically only a single trip through
     * the list. To manage the "find" of the sum it keeps a running total and once over the threshold it
     * subtracts values (earliest values removed first) until it falls back under the threshold. This subtraction
     * bit I don't think changes the complexity, while it does this in a loop it isn't a full loop for each
     * outer step (and not every outer loop results in an inner loop).
     *
     * This approach requires no additional storage.
     *
     * @param input The set of values we are checking against
     * @param targetSum The target sum we are looking for
     * @return boolean Returns true if we find a continuous subarray whose sum is equal to our target, false otherwise
     */
    public static boolean findSubarryWithSum2(List<Integer> input, int targetSum) {
        int sum = 0;
        int start = 0;
        for (int i = 0; i < input.size(); i++) {
            sum+= input.get(i);
            if (sum == targetSum) {
                return true;
            }

            while (sum > targetSum && start < i) {
                sum -= input.get(start);
                start++;
            }
            if (sum == targetSum) {
                return true;
            }
        }
        return false;
    }

}
