import java.util.*;

public class Array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for(int i:arr1){
            System.out.println(i);
        }
    }
}