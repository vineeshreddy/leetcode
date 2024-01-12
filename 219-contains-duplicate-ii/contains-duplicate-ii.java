/*class Solution {
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
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            System.out.println(set.size());
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}