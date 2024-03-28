//sliding window problem
//O(2n) with O(k) space (k=distinct element in array)
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start=0;
        int end=0;
        int maxlen=0;
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        while(end<n){
            
            //expansion
            freq.put(nums[end],freq.getOrDefault(nums[end],0)+1);
            //shrinking
            while(freq.get(nums[end])>k){
                freq.put(nums[start],freq.get(nums[start])-1);
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}