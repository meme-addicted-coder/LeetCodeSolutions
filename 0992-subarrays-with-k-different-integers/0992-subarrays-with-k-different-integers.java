class Solution {
    public int subarraysWithKDistinct(int[] nums, int k){
        return subarrays(nums,k)-subarrays(nums,k-1);
    }
    public int subarrays(int[] nums, int k) {
        int start=0;
        int end=0;
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        while(end<n){
            //expansion
            freq.put(nums[end],freq.getOrDefault(nums[end],0)+1);
            //shrinking 
            while (freq.size()>k) {
                freq.put(nums[start], freq.get(nums[start]) - 1);
                if (freq.get(nums[start]) == 0) {
                    freq.remove(nums[start]);
                }
                start++;
            }
        // Count subarrays with exactly k distinct integers
        count += (end - start + 1);
        end++;
        }
        return count;  
    }
}