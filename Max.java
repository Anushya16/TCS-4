import java.util.;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 7, 1};

        int result = Math.max(arr[0], arr[1]);

        for (int i = 1; i < arr.length - 1; i++) {
            int currentMax = Math.max(arr[i], arr[i + 1]);
            result = currentMax - result;
        }

        System.out.println(result);
    }
}