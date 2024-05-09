class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int l=happiness.length;
        long c=0;
        long ans=0;
        int i=l-1;
        while(k>0){
            if(happiness[i]-c <0){
                return ans;
            }
            ans+=(long)happiness[i]-c;
            k--;
            c++;
            i--;
        }
        return ans;
    }
}