class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            char prevChar = s.charAt(i - 1);
            char currChar = s.charAt(i);
            score += Math.abs(currChar - prevChar);
        }
        return score;
    }
}