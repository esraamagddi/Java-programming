import java.util.Random;

public class search {

    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Start time
        Random random = new Random(); 

        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1001);
        }

        int min = Integer.MAX_VALUE;  
        int max = Integer.MIN_VALUE;  

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nMin Value: " + min);
        System.out.println("Max Value: " + max);

        long endTime = System.nanoTime(); // End time
        long elapsedTime = endTime - startTime; // Calculate total time
        System.out.println("Running Time: " + elapsedTime + " nanoseconds");
    }
}
