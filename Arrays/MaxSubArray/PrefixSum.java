package Arrays.MaxSubArray;

public class PrefixSum {
    public static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;     
        int currentSum = 0;                 

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];           // Add the current element to currentSum

            if (currentSum > maxSum) {      // Update maxSum if currentSum is greater
                maxSum = currentSum;
            }

            if (currentSum < 0) {           // Reset currentSum to 0 if it becomes negative
                currentSum = 0;
            }
        }
        return maxSum;                    // Return the maximum subarray sum found
    }
}

// Time Complexity: O(n) because we traverse the array once.
// Space Complexity: O(1) because we use only a constant amount of extra space.
// This algorithm is known as Kadane's Algorithm, which efficiently finds the maximum subarray sum in linear time.