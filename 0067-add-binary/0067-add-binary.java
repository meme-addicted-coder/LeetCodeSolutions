class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int base=2,carry = 0;
        while(i>=0 || j>=0){
            int t1=0,t2=0,sum=0;
            if (i >= 0) {
            t1= a.charAt(i--) - '0';
            }
            if (j >= 0) {
            t2= b.charAt(j--) - '0';
            }
            sum=t1+t2+carry;
            if(sum>=base){
                carry=1;
                sum=sum-base;
            }
            else
                carry=0;
            
            res.append(sum);
        }
        if(carry==1) res.append(carry);
        return res.reverse().toString();
    }
}