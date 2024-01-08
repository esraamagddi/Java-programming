import java.util.Arrays;
import java.util.Random;

public class binarysearch {

    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(1001); 
        }
        Arrays.sort(arr);

        int target = random.nextInt(1001); 

        long startTime = System.nanoTime();

        int result = binarySearch(arr, target);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        if (result == -1) {
            System.out.println("Element " + target + " not present in array");
        } else {
            System.out.println("Element " + target + " found at index " + result);
        }

        System.out.println("Running Time: " + elapsedTime + " nanoseconds");
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // found in the middle
            }

            if (arr[mid] < target) {
                left = mid + 1; // cut left
            } else {
                right = mid - 1; // cut right
            }
        }

        return -1; // target not exist
    }
}
