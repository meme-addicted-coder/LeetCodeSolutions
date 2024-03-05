//TC: O(N) in 2pointer method
//can be solved in recursion,but with extra stack
//base case: 1. chratp!=chrats  2.
class Solution {
    public int minimumLength(String s) {
       int len=s.length();
       int pre=0;
       int suf=len-1;
       while(pre<suf && s.charAt(pre)==s.charAt(suf)){
           char ch=s.charAt(pre);
           while(pre<=suf && s.charAt(pre)==ch){
               pre++;
           }
           while(pre<=suf && s.charAt(suf)==ch){
               suf--;
           }
       }
       return (suf-pre+1); 
    }
}