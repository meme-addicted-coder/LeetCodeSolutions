class Solution
{
    public int lengthOfLastWord(String s){
        int c = 0;
        s = s.trim();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                c = 0;
                continue;
            }
            else
                c++;
        }
        return c;
    }
}