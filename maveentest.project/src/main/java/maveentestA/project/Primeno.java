package maveentestA.project;

import java.util.Scanner;

public class Primeno {
	public static void main(String args[])
	{
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter no:");
	int a=s.nextInt();
	int count=0;
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			count=1;
			break;
		}
	}
	if(count==1)
	{
		System.out.println("it is not prime no.");
	}
	else
	{
		System.out.println("it is prime no.");
	}
	}
}
