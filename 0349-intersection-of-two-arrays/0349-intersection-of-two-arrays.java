//1. bruteforce:ele in nums1 searched in nums2 
//2. seaching with two set
//3.searching with one set

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       ArrayList<Integer> com=new ArrayList<>();
       for(int n2  : nums2){
           set.add(n2);
       }
       for(int n1:nums1){
           if(set.contains(n1)){
               com.add(n1);
               set.remove(n1);
           }
       }
       int[] res=new int[com.size()];
       for(int i=0;i<res.length;i++){
           res[i]=com.get(i);
       }
       return res;
    }
}
