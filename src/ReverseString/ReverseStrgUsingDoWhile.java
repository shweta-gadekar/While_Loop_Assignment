package ReverseString;

import java.util.Scanner;

public class ReverseStrgUsingDoWhile {

	public static void main(String[] args) {
		System.out.println("Enter a string = ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		// 1. print string
		int i=0;
		System.out.print("Entered string = ");
		do {
			System.out.print(str.charAt(i));
			i++;
		}while(i<=str.length()-1);
		
		// 2. print string in reverse
		System.out.print("\nReversed string = ");
		i=str.length()-1;
		do {
			System.out.print(str.charAt(i));
			i--;
		}while(i>=0);
	}

}
