//sliding window
//TC:O(N) SC; O(1)
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minI=-1;
        int maxI=-1;
        int LB=-1;
        int n= nums.length;
        long ans=0;
        for(int curr=0;curr<n;curr++){
            if(nums[curr] == minK) minI=curr;
            if(nums[curr] == maxK) maxI=curr;
            if(nums[curr]<minK || nums[curr]> maxK){
                LB= curr;
            }
            if(maxI!= -1 && minI != -1){
                int smaller=Math.min(maxI,minI);
                if((smaller-LB)>0){
                    ans+=smaller-LB;
                }
            }
        }
    return ans;
    }
}