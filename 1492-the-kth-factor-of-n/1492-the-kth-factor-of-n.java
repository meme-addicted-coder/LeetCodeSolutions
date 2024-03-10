class Solution {
    public int kthFactor(int n, int k) {
        int kfact=1;
        int output=-1;
        if(k==1) return kfact;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                kfact++;
                if(kfact==k){
                    output=i;
                }
            }
        }
        if(output==-1 && k==kfact+1){
            output=n;
        }
        return output;
    }
}