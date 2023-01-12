// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int map[]=new int[101];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }
        int running=0;
        for(int i=0;i<=100;i++){
            int temp=map[i];
            map[i]=running;
            running+=temp;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            nums[i]=map[nums[i]];
        }

        return nums;
    }
}
