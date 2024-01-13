class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create Hasmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            //get the complemnt using the target value
            int complement = target - nums[i];
            //search the hashmap for the complement,if found we got our pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};

            }
            //put the elemnt in the hasmap for subsequent searches
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException(" not found");
    }
}