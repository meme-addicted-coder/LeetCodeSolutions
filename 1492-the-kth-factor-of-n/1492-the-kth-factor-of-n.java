class Solution {
    public int kthFactor(int n, int k) {
       /* int kfact=1;
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
        return output;*/

        //advanced approach
        /*Let's assume n is 12. The divisors of n are: {1, 2, 3, 4, 6, 12}. But now look at them from another angle:
            1 * 12 = 12
            2 * 6 = 12
            3 * 4 = 12
            If i is a divisor of n, then n / i is a divisor of n as well. 
            Consequently, we can find all the divisors of n only by processing the numbers that are smaller or 
            equal to the square root of n.*/
        for(int i = 1; i < Math.sqrt(n); ++i){
            if(n % i== 0 && --k == 0){
                return i;
            }    
        } 
	                        
        for(int i = (int) Math.sqrt(n); i >= 1; --i) {
            if(n % (n/i) == 0 && --k == 0){
                return n/i;
            }
        }
              
        return -1;
    }
}