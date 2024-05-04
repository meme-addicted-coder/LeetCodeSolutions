class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int boats = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                // If the lightest and heaviest person can share a boat, do so.
                i++;
            }
            // The heaviest person always gets on a boat.
            j--;
            boats++;
        }
        return boats;
    }
}