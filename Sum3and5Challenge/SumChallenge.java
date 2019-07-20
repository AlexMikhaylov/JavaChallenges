package Sum3and5Challenge;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 20.07.2019
 */
public class SumChallenge {
	
	/*
	 * Printing 5 numbers from a range of numbers, which
	 * can be divided with both 3 and also with 5
	 * And printing the sum of them
	 */
	public static void sumChallenge(int first, int second) {
		if((first < second) && (first > 0) && (second > 0)) {
			int count = 0;
			int sum = 0;
			for(int i = first; i <= second; i++) {
				if(count < 5){
					if(i % 3 == 0 && i % 5 == 0) {
					count++;
					sum += i;
					System.out.println(i + " can be divided both with 3 and 5. " + sum +
							" is the sum. This was the " + count + " number.");
					}
				}else {
					break;
				}
			}
			System.out.println("Sum = " + sum);
		}else {
			System.out.println("Invalid Value");
		}
	}
	
	/*
	 * Testing the method
	 */
	public static void main(String[] args) {
		sumChallenge(1, 1000);
		sumChallenge(-10, 10);
		sumChallenge(10, -10);
		sumChallenge(1, 1);

	}

}
