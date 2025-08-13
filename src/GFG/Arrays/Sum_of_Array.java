// Problem: Sum of Array
// Link: https://practice.geeksforgeeks.org/problems/sum-of-array
// Approach: Loop through each element, accumulate sum.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
