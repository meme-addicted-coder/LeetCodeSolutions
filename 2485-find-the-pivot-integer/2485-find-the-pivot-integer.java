//brute force approach: O(n^2)
//Optimized: O(n)
//1. LS=0 RS=n*(n+1)/2 then traverse k till if LS=RS
/*class Solution {
    public int pivotInteger(int n) {
        int ls=0;
        int rs=n*(n+1)/2;
        for(int k=1;k<=n;k++){
            ls+=k;
            rs-=(k-1);
            if(ls==rs){
                return k;
            }
        }
        return -1;
    }
}*/
//2.mathematical approach: pivot= (int)root of sum,if pivot*pivot==sum ,pivot exists
class Solution {
    public int pivotInteger(int n) {
    int sum=n*(n+1)/2;    
    int pivot =(int)Math.sqrt(sum);
    return (pivot*pivot==sum)?pivot:-1;
    }
}