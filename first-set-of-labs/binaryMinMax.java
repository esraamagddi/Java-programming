import java.util.Arrays;

public class binaryMinMax {

    public static void main(String[] args) {
        int[] arr = new int[1000];
        Arrays.sort(arr);

        long startTime = System.nanoTime();

        // Find the minimum value using binary search
        int minIndex = binarySearchMin(arr);
        int minValue = (minIndex != -1) ? arr[minIndex] : Integer.MIN_VALUE;

        // Find the maximum value using binary search
        int maxIndex = binarySearchMax(arr);
        int maxValue = (maxIndex != -1) ? arr[maxIndex] : Integer.MAX_VALUE;

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Minimum value: " + minValue + " at index " + minIndex);
        System.out.println("Maximum value: " + maxValue + " at index " + maxIndex);
        System.out.println("Running Time: " + elapsedTime + " nanoseconds");
    }

    private static int binarySearchMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid; // Index of the minimum value found
            }

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Array is already sorted
    }

    private static int binarySearchMax(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid; // Index of the maximum value found
            }

            if (arr[mid] < arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Array is already sorted
    }
}
