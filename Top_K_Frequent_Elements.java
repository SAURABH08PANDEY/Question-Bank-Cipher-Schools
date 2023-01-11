// https://leetcode.com/problems/top-k-frequent-elements/description/



class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int answer[]=new int [k];

        ArrayList<Integer> bucket[]=new ArrayList[nums.length+1];

        for(int key:map.keySet()){
            int value=map.get(key);
            if(bucket[value]==null){
                bucket[value]=new ArrayList<>();
            }
            bucket[value].add(key);
        }
        for(int i=nums.length;i>=0;i--){
            if(bucket[i]!=null&&k>0){
                for(int x:bucket[i]){
                    if(k<=0){
                        break;
                    }
                    answer[k-1]=x;
                    k--;
                }
            }
        }
        return answer;

    }
}
