class Solution {
    public int[] productExceptSelf(int[] nums) {
        // while considering the 0th index excpet that index reaming all indexes are multiplied
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        prefix[0] = 1;
        for(int i=1; i<nums.length; i++) {
            // 5 4 3 2 1 (nums)
            // 1 5 20 60 120(prefix)
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        postfix[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--) {
            // 5 4 3 2 1(nums)
            // 24 6 2 1 1(postfix)
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        for(int i=0; i<nums.length; i++) {
            postfix[i] = postfix[i] * prefix[i];
        }
        return postfix;    
    }
}