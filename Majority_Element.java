// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int times=1;
        for(int i=1;i<nums.length;i++){
            if(majority!=nums[i]){
                times--;
            }
            else{
                times++;
            }
            if(times==0){
                majority=nums[i];
                times=1;
            }
        }
        return majority;

    }
}
