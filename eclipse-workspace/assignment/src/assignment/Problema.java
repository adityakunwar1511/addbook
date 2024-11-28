package assignment;
import java.util.Scanner;

public class Problema {
	  public static void main(String[] args) {
	        int flips;
	        int heads = 0, tails = 0;

	        // Create a scanner for input
	        Scanner scanner = new Scanner(System.in);

	        // Input: Number of times to flip the coin
	        System.out.print("Enter the number of times to flip the coin (positive integer): ");
	        flips = scanner.nextInt();

	        if (flips <= 0) {
	            System.out.println("Please enter a positive integer.");
	            scanner.close();
	            return;
	        }

	        // Seed the random number generator
	        java.util.Random random = new java.util.Random();

	        // Flip the coin
	        for (int i = 0; i < flips; i++) {
	            if (random.nextDouble() < 0.5) {
	                tails++;
	            } else {
	                heads++;
	            }
	        }

	        // Calculate percentages
	        double headsPercentage = (double) heads / flips * 100;
	        double tailsPercentage = (double) tails / flips * 100;

	        // Output results
	        System.out.println("Percentage of Heads: " + headsPercentage + "%");
	        System.out.println("Percentage of Tails: " + tailsPercentage + "%");

	       // scanner.close();
	    }
}
