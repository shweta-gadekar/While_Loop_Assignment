package PrintTable;

import java.util.Scanner;

public class ReverseTableUsingWhile {

	public static void main(String[] args) {
			int i=10;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a number to obtain its reverse table :");
			int num=sc.nextInt();
			
			while(i>=1) {
			System.out.print(i*num+" ");
			i--;
			//System.out.println("\n");
			
			}
			
			i=10;
			System.out.print("\nEnter a number to obtain its reverse table :");
			num=sc.nextInt();
			do {
				System.out.print(i*num+" ");
				i--;
			}while(i>=1);
	}

}
