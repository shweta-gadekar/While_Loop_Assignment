package ReverseString;

import java.util.Scanner;

public class ReverseStrgUsingWhile {

	public static void main(String[] args) {
		System.out.println("Enter a string = ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		// 1. print string
		int i=0;
		System.out.print("Entered string = ");
		while(i<=str.length()-1) {
			System.out.print(str.charAt(i));
			i++;
		}
		
		// 2. print string in reverse 
		System.out.print("\nReversed string = ");
		 i=str.length()-1;
		while(i>=0) {
			System.out.print(str.charAt(i));
			i--;
		}
	}

}
