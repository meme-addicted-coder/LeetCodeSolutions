//1 BF :for each element Iterate the list O(n2)
//2 HashSet O(n) but extra space O(n)
//3 pop inplace O(n) but again modify 
//4 Floyds cylce detection O(n)
class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];

        }while(slow!=fast);
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;    
        
    }
}