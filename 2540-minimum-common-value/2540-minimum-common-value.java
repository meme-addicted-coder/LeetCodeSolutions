//brute force: O(n*m)
//hashing: O(n+m) sc O(m)
//binary search O(min(n,m)log max(n,m))
//4th two pointer O(n+m) no extra space
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            } 
            if(nums1[i]<nums2[j]){
                i++;
            }
            else j++;
        }
        return -1;
    }
}
/*
class Solution {
    public int getCommon(int[] nums1, int[] nums2)  {
        int n = nums1.length;
        int m = nums2.length;

        // Handle empty arrays
        if (n == 0 || m == 0) {
            return -1;
        }

        // Identify the shorter and longer array
        int[] shorter = n <= m ? nums1 : nums2;
        int[] longer = n <= m ? nums2 : nums1;

        // Iterate through the shorter array
        for (int num : shorter) {
            int index = binarySearch(longer, num);

            // Check if element exists
            if (index != -1) {
                return num;
            }
        }

        // No common element found
        return -1;
    }

    private int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}*/
