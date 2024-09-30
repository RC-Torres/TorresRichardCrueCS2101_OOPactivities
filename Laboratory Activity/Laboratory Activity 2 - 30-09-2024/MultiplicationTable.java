import java.util.Scanner;

public class MultiplicationTable {

    // Function for getting the maximum number for the multiplication table
    public static int getMaxNumber() {
        // Creating a scanner to take the max size of the multiplication table
        Scanner input = new Scanner(System.in);

        // Taking input for the maximum number for the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int maxNumber = input.nextInt();
        
        // Closing the scanner after taking input
        input.close(); 

        return maxNumber; // Return the max number
    }

    // Function for getting the values of the table
    public static void getTable(int[][] multiplicationTable, int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                multiplicationTable[i][j] = i * j;
            }
        }
    }

    // Function for printing the table
    public static void printTable(int[][] multiplicationTable, int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                int number = multiplicationTable[i][j];
                System.out.printf("%4d", number); // Prints each number with 4 spaces
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Get the maximum number for the multiplication table
        int maxNumber = getMaxNumber();

        // Creating a two-dimensional array for the multiplication table
        int[][] multiplicationTable = new int[maxNumber + 1][maxNumber + 1];

        // Populating the table by passing to a function
        getTable(multiplicationTable, maxNumber);

        // Print the multiplication table using nested loops and formatting
        System.out.println("Multiplication Table:");
        printTable(multiplicationTable, maxNumber);
    }
}