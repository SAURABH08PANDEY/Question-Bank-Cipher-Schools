//  https://leetcode.com/problems/asteroid-collision/



class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int rightMax=0;
        Stack<Integer> st=new Stack<Integer>();
        System.out.println(st.size());
        for(int i=0;i<asteroids.length;i++){
            if(st.size()==0||asteroids[i]>0||st.peek()<0){
                st.push(asteroids[i]);
                continue;
            }
            else{
                while(true){
                    if(st.empty()){
                        st.push(asteroids[i]);
                        break;
                    }
                    else if(st.peek()>0&&st.peek()<Math.abs(asteroids[i])){
                        st.pop();
                    }
                    else if(st.peek()>0&&st.peek()==Math.abs(asteroids[i])){
                        st.pop();
                        break;
                    }
                    else if(st.peek()>0&&st.peek()>Math.abs(asteroids[i])){
                        break;
                    }
                    else{
                        st.push(asteroids[i]);
                        break;
                    }

                }
            }
            
        }
         int[] arr =new int[st.size()];
         int i=st.size()-1;
         while(!st.empty()){
             arr[i]=st.pop();
             i--;
         }
        return arr;
    }
}
