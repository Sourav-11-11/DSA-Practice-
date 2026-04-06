package Arrays;
public class PrintPairs {
    public static void PrintPair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + current + ", " + arr[j] + ")");
            }
        }
    }
}       