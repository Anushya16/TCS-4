import java.util.*;

public class MaxSumOfK {
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 1, 7};
        int k = 3;

        int sum = 0;

        // Sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
