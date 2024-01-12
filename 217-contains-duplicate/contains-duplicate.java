class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Sort the array
        //compare the i with next adjacent value
        Arrays.sort(nums);
        for (int i =0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]) {
            return true;
            }
        }
        return false;
    }
}
/*
public boolean containsDuplicate(int[] nums) {
        
        //including hashset containing Integers
        Set<Integer> set = new HashSet<>(); 
        // for each element in the nums
        for(int num : nums) {
            // accroding to hash set , a hash set contains all uniique integers but so each elemnt gets added, so if a array sees the same numebers it wont add up so in that case the number which is not getting added we return true becoz its a repeated number.
            if (!set.add(num)) {
                return true;
            } 
        }
        if all the numvers are unique in the hasset it returns False
        return false;
    }
*/