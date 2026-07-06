import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (left != right) {
                System.out.print(arr[right] + " " + arr[left] + " ");
            } else {
                System.out.print(arr[left]);
            }
            right--;
            left++;
        }

        sc.close();
    }
}