package javafirst;

import java.util.Scanner;

public class ArrRun {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements:");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+"");
		}
		sc.close();
	}

}
