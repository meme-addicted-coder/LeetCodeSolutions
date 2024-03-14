class Solution {
    public int numSubarraysWithSumatmost(int[] nums, int goal) {
        int start=0;
        int sum=0;
        int count=0;
        int n=nums.length;
        for(int end=0;end<n;end++)
        {
            sum+=nums[end];
            while(start<=end && sum>goal){
                sum-=nums[start];
                start++;
            }
            count+=(end-start+1);
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal)
    {
        return numSubarraysWithSumatmost(nums,goal)- numSubarraysWithSumatmost(nums,goal-1);
    }

}