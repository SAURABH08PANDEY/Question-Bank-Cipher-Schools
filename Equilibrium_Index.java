// https://practice.geeksforgeeks.org/problems/equilibrium-index-of-an-array/1


class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                int sum=0;
                for(int x:arr){
                    sum+=x;
                }
                int answer=-1;
                int sum2=0;
                for(int i=0;i<n;i++){
                    if(sum-arr[i]==sum2){
                        return i;
                    }
                    sum2+=arr[i];
                    sum-=arr[i];
                }
                return answer;
              }
}
