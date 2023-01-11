// https://leetcode.com/problems/pascals-triangle/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer=new ArrayList<List<Integer>>();
        List<Integer> one,two=null;
        for(int i=0;i<numRows;i++){
            one=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    one.add(1);
                    continue;
                }
                one.add(two.get(j)+two.get(j-1));
            }
            two=one;
            answer.add(two);
        } 
        return answer;
    }
}
