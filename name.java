package javafirst;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String n=sc.nextLine();
		System.out.println("Fourth character= "+n.charAt(3));
		sc.close();
	}
}