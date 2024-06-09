package PatternProgram;

import java.util.Scanner;

public class LeftHalfPyramid {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		int n=size;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j<=size; j++) {
				if (j>=n) {
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+" ");
				}
			}
			n--;
			System.out.println();
		}
		scanner.close();
	}

}
