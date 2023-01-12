// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer=new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }

        for(int x:candies){
            if(x+extraCandies>=max){
                answer.add(true);
            }

            else{
                answer.add(false);
            }
        }

        return answer;
    }
}
