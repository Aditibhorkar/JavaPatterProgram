package PatternProgram;

import java.util.Scanner;

public class ReverseRightHalfPyramid {
	
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		for (int i = size; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
