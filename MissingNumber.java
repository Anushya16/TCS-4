import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 7};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];

            while (current + 1 < next) {
                System.out.print(current + 1 + " ");
                current++;
            }
        }
    }
}