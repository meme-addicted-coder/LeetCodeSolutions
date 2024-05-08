class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        
        // Create a list of pairs (score, index)
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pairs.add(new int[]{score[i], i});
        }
        
        // Sort the list based on the scores in descending order
        pairs.sort((a, b) -> b[0] - a[0]);
        
        // Assign ranks to the athletes
        for (int i = 0; i < n; i++) {
            int index = pairs.get(i)[1];
            if (i == 0) {
                answer[index] = "Gold Medal";
            } else if (i == 1) {
                answer[index] = "Silver Medal";
            } else if (i == 2) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(i + 1);
            }
        }
        return answer;
    }
}