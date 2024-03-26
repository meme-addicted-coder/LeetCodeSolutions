//1 brute force: for each element traverse the whole list O(N^2) no extra space
//2 sort then find duplicates in pairs in O(nlogn) extra spc O(n) (buble sort O*n2) but no spc  
//3 Hashing O(n) but exyta space o(N)
//4 POP O(N) NO SPACE
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=  new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int element=Math.abs(nums[i]);
            int seat=element-1;
            if(nums[seat]<0){
                res.add(element);
            }
            else{
                nums[seat]=-nums[seat];
            }
        }
        return res;
    }
}