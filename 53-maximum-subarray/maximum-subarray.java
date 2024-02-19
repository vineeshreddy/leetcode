class Solution {
    public int maxSubArray(int[] nums) {
        /* Max sub array sum so far */
        int maxSum = nums[0];
        /* Sub array sum upto a given index */
        int subArrySum = 0;
        for(int num : nums) {
            /* prev sub array sum is already -ve, adding prev sub array sum will make our current subArrySum smaller. Reset the prev sub array sum to 0 in this case */
            subArrySum = Math.max(subArrySum, 0);
            /* Compute the sub array sum. If prev sub array sum is -ve, then we are only considering the current element */
            subArrySum += num;
            /* Update the max sub array sum */
            maxSum = Math.max(subArrySum, maxSum);
        }
        return maxSum;
    }
}