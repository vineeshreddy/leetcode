class Solution {
    public int[] productExceptSelf(int[] nums) {
        // while considering the 0th index excpet that index reaming all indexes are multiplied
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        prefix[0] = 1;
        for(int i=1; i<nums.length; i++) {
            // 5 4 3 2 1 (nums) 1 2 3 4
            // 1 5 20 60 120(prefix) 1 1 2 6
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        postfix[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--) {
            // 5 4 3 2 1(nums) 1 2 3 4
            // 24 6 2 1 1(postfix)   24 12 4 1
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        for(int i=0; i<nums.length; i++) {
            postfix[i] = postfix[i] * prefix[i];
        }
        return postfix;    
    }
}
/*
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // while considering the 0th index excpet that index reaming all indexes are multiplied
        // Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
        int[] output = new int[nums.length];
        output[0] = 1;
        for(int i=1; i<nums.length; i++) {
            // 5 4 3 2 1 (nums) 1 2 3 4
            // 1 5 20 60 120(prefix) 1 1 2 6
            output[i] = output[i-1] * nums[i-1];
        }
        int R=1;
        for(int i=nums.length-1; i>=0; i--) {

            // 1 1 2 6
            output[i] = output[i] * R; //  6*1=6 // 2*4=8 // 12*1=12 // 24 *1=24
            R = R * nums[i]; 1 2 3 4  //  1* 4 =4  // 4*3= 12 // 12 * 2 = 24 // 
        }
        return output;    
    }
}
*/
