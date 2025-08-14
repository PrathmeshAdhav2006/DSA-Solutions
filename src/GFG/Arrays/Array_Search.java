/*
Approach:
- Iterate through the array elements.
- Compare each element with the target value.
- If a match is found, return its index.
- If no match is found, return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LinearSearch {
    public int search(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
