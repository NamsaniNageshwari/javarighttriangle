import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of rows for the triangle
        System.out.print("Enter the number of rows for the right triangle: ");
        int rows = scanner.nextInt();
        
        // Loop to print each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}

