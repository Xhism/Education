import java.util.Scanner;


public class Ex03_LargestEqualSequence {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a line of words:");
		String str = input.nextLine();
		String[] arr = str.split(" ");
		int currentLength = 1;
		int bestLength = 1;
		int latestPosition = 0; 

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				currentLength++;
			} else {
				currentLength = 1;
			}
			if (currentLength > bestLength) {
				bestLength = currentLength;
				latestPosition = i;
			}
		}
		for (int j = 0; j < bestLength; j++) {
			System.out.print(arr[latestPosition] + " ");
		}
		System.out.println();
	}
}