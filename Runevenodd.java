package javafirst;

import java.util.Scanner;
public class Runevenodd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		evenodd ob=new evenodd(n);
		ob.check();
		sc.close();
	}

}
