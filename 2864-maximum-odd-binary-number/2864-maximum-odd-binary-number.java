//1st appr:sort,swap: O(NlogN)+O(N)
//2nd appr:count 1s 0s, put all 1s except 1 at first thn 0 thn 1 :O(2N)
//3rd two pointer method: O(N)
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length(); 
        int left=0;
        int right=n-1;
        char arr[]=s.toCharArray();
        while(left<=right)
        {
            if(arr[left]=='1')
            {
                left++;
            }
            if(arr[right]=='0')
            {
                right--;
            }
            if(left<right && arr[left]=='0'&& arr[right]=='1')
            {
                arr[left]='1';
                arr[right]='0';
            }
        }
        arr[right]='0';
        arr[n-1]='1';
        return new String(arr);
    }

}