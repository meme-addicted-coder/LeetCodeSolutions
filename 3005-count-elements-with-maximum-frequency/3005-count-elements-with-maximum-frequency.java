class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freqarr[]=new int[101];
        int maxfreq=0;
        int sumfreq=0;
        for(int element:nums){
            freqarr[element]++;
            int curfreq=freqarr[element];
            if(curfreq>maxfreq){
                maxfreq=curfreq;
                sumfreq=curfreq;

            }else if(curfreq==maxfreq){
                sumfreq+=curfreq;
            }
        }
        return sumfreq;

    }
}