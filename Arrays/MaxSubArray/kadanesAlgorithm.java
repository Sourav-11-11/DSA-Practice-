package Arrays.MaxSubArray;

public class kadanesAlgorithm {
    public static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;                

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];           
            maxSum = Math.max(maxSum, currentSum);  

            if (currentSum < 0) {           // Reset currentSum to 0 if it becomes negative
                currentSum = 0;
            }
        }
        return maxSum;                    
    }
}