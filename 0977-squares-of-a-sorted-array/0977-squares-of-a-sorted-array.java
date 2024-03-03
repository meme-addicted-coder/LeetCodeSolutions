class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       int l=0;
       int r=n-1;
       int j=n-1;
       while(l<=r)
       {
           int sql=nums[l]*nums[l];
           int sqr=nums[r]*nums[r];
           if(sql>=sqr)
           {
               res[j]=sql;
               l++;
           }
           else
           {
               res[j]=sqr;
               r--;
           }
            j--;
      }
      return res;   
    }
}
//this can also be done by finding the smallest pos no
//right and left compared,smallest num is added in res array
//l--,r++ in that case