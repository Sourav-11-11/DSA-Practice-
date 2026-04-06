package Arrays;

public class PrintSubarrays {
    public static void printSubarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {      //start=i
            for (int j = i; j < arr.length; j++) {  //end=j
                // System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                // System.out.println("]");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printSubarray(arr);
    }
}
