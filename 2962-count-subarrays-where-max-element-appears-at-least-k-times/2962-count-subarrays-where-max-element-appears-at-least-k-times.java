//sliding window problem O(3N)
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int start=0;
        int end=0;
        long count=0;
        int n=nums.length;
        int maxel=Integer.MIN_VALUE;
        int freq=0;
        //max element
        for(int i=0;i<n;i++){
            maxel=Math.max(maxel,nums[i]);
        }
        
        while(end<n){
            //expansion
            if(nums[end]==maxel){
                freq++;  
            }
            //shrinking
            while(freq==k){
                count=count+(n-end);
                if(nums[start]==maxel){
                    freq--;
                }
                start++;
            }
            end++;
        }
        return count;
    }
}