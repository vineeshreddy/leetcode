class Solution {
    public int trap(int[] height) {
        int res = 0;
        // max height from left to index i
        // max height from index i to right
        // min (left_max, right_max) - height[i]
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0]; 
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        final int size = height.length-1;
        int[] rightMax = new int[height.length];
        rightMax[size] = height[size];
        for(int i=size-1; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        
        
        for(int i=1; i<height.length-1; i++) {
            // compare with left and right bar
            // height[i] < Math.min(height[i-1], height[i+1])
            // res = Math.min(height[i-1], height[i+1]) - height[i]
            int min = Math.min(leftMax[i], rightMax[i]);
            if(height[i] < min) {
                res += min - height[i];
            }
        }
        return res;
    }
}