class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=0;
        while(i < nums.length) {
            j = Math.max(0, i-k);
            while(j < i) {
                if(nums[j] == nums[i]) return true;
                j++;
            }
            i++;
        }
        return false;
    }
}