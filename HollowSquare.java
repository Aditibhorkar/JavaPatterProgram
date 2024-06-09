package PatternProgram;

import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		for (int i = 0; i <=size; i++) {
			for (int j = 0; j <= size; j++) {
				if (i == 0 || j == 0 || j == size || i == size) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
