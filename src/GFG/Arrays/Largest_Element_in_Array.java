
/*
Approach:
- Initialize `max` with the first element of the array.
- Traverse the array from the second element onwards.
- If the current element is greater than `max`, update `max`.
- After traversing the entire array, return `max`.

Time Complexity: O(n)   // n = number of elements
Space Complexity: O(1)  // No extra space used
*/

public class LargestElement {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
