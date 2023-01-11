// https://leetcode.com/problems/rotate-array/


class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        k=k%length;
        int times=GCD(length,k);
        System.out.println(times);
        for(int i=0;i<times;i++){
            int x=-1;
            int temp=-1;
            int temp2=0;
            int temp3=0;
            while(x!=i){
                if(temp==-1){
                    x=i;
                    temp=0;
                    temp3=nums[x];
                }
                temp2=nums[(x+k)%length];
                nums[(x+k)%length]=temp3;
                temp3=temp2;
                x=(x+k)%length;

            }
        }
    }


    public int GCD(int a, int b){   
        if (b == 0)   
        return a;     
        return GCD(b, a % b);   
        }  
    }
