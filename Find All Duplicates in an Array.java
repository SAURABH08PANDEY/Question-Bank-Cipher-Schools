//https://leetcode.com/problems/find-all-duplicates-in-an-array/



class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer=new ArrayList<Integer>();
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>=0){
                nums[Math.abs(nums[i])-1]*=-1;
            }
            else{
                answer.add(Math.abs(nums[i]));
            }
        }
        return answer;
    }
}
