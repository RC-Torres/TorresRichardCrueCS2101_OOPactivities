import java.util.Scanner;

public class GetArrayMean{

    // Function to calculate the mean of the integer array
    public static double getArrayMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length; 
    }

    public static void main(String[] args) {
        // Creating a scanner object to take size of the array
        Scanner input = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        // Creating the array to store the integers
        int[] array = new int[n];

        // Taking inputs for the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
        }

        // Pass the array to the function "getArrayMean" and print the result
        double mean = getArrayMean(array);
        System.out.printf("Mean of array is: %.2f", mean);

        // Closing scanner to avoid memory leaks
        input.close();
    }
}