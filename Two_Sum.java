//https://leetcode.com/problems/two-sum/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> record=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(record.containsKey(target-nums[i])){
                return new int[]{i,record.get(target-nums[i])};
            }
            else{
                record.put(nums[i],i);
            }
        }
        return null;
    }
}
