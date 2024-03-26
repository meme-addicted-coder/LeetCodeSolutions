//1 brute force->check if 1 is present,2...worst case till n. O(n2)
//2 Sort array then checkn adjacent two elements
//3 hashing O(2n) but takes extra space O(n)
//4 pigonhole principle O(3n)ie O(n) with O(1) space
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        //data filtering
        for(int i=0;i<n;i++){
            if(nums[i]>=n+1 || nums[i]<=0){
                nums[i]=n+1;
            }
        }
        //marks visited
        for(int i=0;i<n;i++){
            int element=Math.abs(nums[i]);
            if(element==n+1){
                continue;
            }
            int seat=element-1;
            if(nums[seat]>0){
                nums[seat]=-nums[seat];
            }
        }
        //postive seat
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return (n+1);

    }
}