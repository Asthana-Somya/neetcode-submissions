class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer>mpp = new HashMap<>();

        for(int i =0;i<n;i++){
            int sumrem = target - nums[i];
            if(mpp.containsKey(sumrem)){
               return new int[]{mpp.get(sumrem),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
