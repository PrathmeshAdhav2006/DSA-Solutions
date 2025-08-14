/*
Approach:
- Use Binary Search to determine if `k` exists in the sorted array.
- Maintain two pointers: `i` (start) and `j` (end).
- Calculate `mid` and compare arr[mid] with k.
- Narrow the search space based on comparison results.
- If found, return true; otherwise, return false.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] > k) {
                j = mid - 1;
            } else if (arr[mid] < k) {
                i = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
