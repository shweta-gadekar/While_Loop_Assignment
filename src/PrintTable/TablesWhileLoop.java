package PrintTable;

import java.util.Scanner;

public class TablesWhileLoop {

	public static void main(String[] args) {
		int num;
		//1. Table using  while loop:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for while loop =");
		num=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.print(i*num+" ");
			i++;
		}
		// 2.Table using do while loop:
		int k=1;
		System.out.println("\nEnter the number for do-while loop: =");
		num=sc.nextInt();
		do{
			System.out.print(k*num+" ");
			k++;
		}while(k<=10);
	}

}
