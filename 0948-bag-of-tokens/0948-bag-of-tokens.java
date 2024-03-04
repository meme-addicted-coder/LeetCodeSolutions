//TC:0(nlogn)+O(n) , SC: O(1)

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int n=tokens.length;
        Arrays.sort(tokens);
        int left=0;
        int right=n-1;
        while(left<=right){
            if(tokens[left]<=power){
                power=power-tokens[left];
                score++;
                left++;
            }
            else if(left<right && score>0){
                power=power+tokens[right];
                right--;
                score--;
            }
            else{
                return score;
            }
        }

        return score;
    }
}