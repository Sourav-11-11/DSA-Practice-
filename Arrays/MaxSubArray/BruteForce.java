package Arrays.MaxSubArray;
public class BruteForce {
    public static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;                // Initialize maxSum to -infinity (Interger.MIN_VALUE)
        for (int i = 0; i < arr.length; i++) { 
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;                    // Initialize currentSum to 0 for each new subarray
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];              // Add the current element to currentSum
                }
                if (currentSum > maxSum) {             // Update maxSum if currentSum is greater
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}

// Time Complexity: O(n^3) because of three nested loops. 
// The outer two loops generate all possible subarrays, and the innermost loop calculates the sum of each subarray.