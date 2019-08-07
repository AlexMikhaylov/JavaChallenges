package ReadingUserInputChallenge;

import java.util.Scanner;

/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 08.08.2019
 */
public class ReadingUserInputChallenge {

	/*
	 * Read 10 numbers from the console entered by the user and print the sum of
	 * those numbers
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 1;
		int sum = 0;

		while (count <= 10) {

			System.out.println("Enter number #" + count + ":");
			boolean hasNextInt = scanner.hasNextInt();

			if (hasNextInt) {

				count++;
				sum += scanner.nextInt();
				

			} else {
				System.out.println("Invalid Number");
			}
			
			scanner.nextLine();
		}

		System.out.println("The sum of the 10 numbers is " + sum);

		scanner.close();

	}

}
