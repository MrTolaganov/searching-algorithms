import java.util.Arrays;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    // Binary Search Method (requires to be sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return index if target is found
            }
            if (arr[mid] < target) {
                left = mid + 1; // Discard left half
            } else {
                right = mid - 1; // Discard right half
            }
        }
        return -1; // Return -1 if target is not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int [] arr=new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i]=(int) (Math.random()*10);
        }

        System.out.println(Arrays.toString(arr));

        // Using Linear Search
        int linearResult = linearSearch(arr, n);
        System.out.println("Linear Search: Index of " + n + " is " + linearResult);

        // Sort array for Binary Search
        Arrays.sort(arr);
        int binaryResult = binarySearch(arr, n);
        System.out.println("Binary Search: Index of " + n + " is " + binaryResult);
    }
}