import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3;

        int n = arr.length;
        k = k % n;

        // Rotate left k times
        for (int i = 0; i < k; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}