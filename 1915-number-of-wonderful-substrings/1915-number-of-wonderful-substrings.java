class Solution {
    public long wonderfulSubstrings(String word) {
        long ans=0;
        //Map
        long seenbinary[]  = new long [1024];
        int mask=0;
        seenbinary[0]=1;
        for(char ch : word.toCharArray()){
            int binary= 1<<(ch -'a');
            mask = mask ^ binary;
            ans+=seenbinary[mask];
            for(int newbinary=1;newbinary<=512;newbinary*=2){ 
                ans+= seenbinary[mask^newbinary];
            }
            seenbinary[mask]++;
        }
        return ans;
    }
}