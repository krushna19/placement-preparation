import java.util.*;

public class krish9 {
    // public static void getminmax(int arr[],int n){
    // int min = new int();
    // int max = new int();
    // Arrays.sort(arr);
    // int min = arr[0];
    // int max = arr[n - 1];
    // return min;
    // return max;
    // }

    public static void main(String args[]) {
        int array[] = { 12, 134, 2, 23, 432 };
        Arrays.sort(array);
        System.out.println("smaleest is" + array[0]);
        System.out.println("largest is" + array[array.length - 1]);
    }
}
