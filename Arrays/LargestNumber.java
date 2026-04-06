package Arrays;

public class LargestNumber {
    public static int Largest(int[]arr){
        int largest = Integer.MIN_VALUE;     // Initialize largest to -infinity (Interger.MIN_VALUE)
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];           // Update largest if the current element is greater
            }
        }
        return largest;

    }
}
