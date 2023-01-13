// https://leetcode.com/problems/longest-substring-without-repeating-characters/



class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        int low=0;
        int high=0;
        int answer=0;
        while(low<s.length()&&high<s.length()){
            if(!map.containsKey(s.charAt(high))||map.get(s.charAt(high))==0){
                map.put(s.charAt(high),1);
                high++;
            }
            else{
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                low++;
            }
            answer=Math.max(answer,high-low);

        }
        return answer;
    }
}
