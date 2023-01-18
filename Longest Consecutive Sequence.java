//https://leetcode.com/problems/longest-consecutive-sequence/



class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> hold=new HashSet();
		int max=1;
		int finalanswer=0;
		int answer=1;
		
		for(int x:nums) {
			hold.add(x);
		}
		
		for(int x:hold) {
          
			if(!hold.contains(x-1)){
                answer=x+1;
                while(hold.contains(answer)){
                    
                    max++;
                    answer++;
                }
                finalanswer=Math.max(finalanswer,max);
                max=1;
            }
		}
        return finalanswer;
    }
}
