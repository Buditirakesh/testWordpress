package maveentestA.project;

import java.util.Scanner;

public class Area {

	int length,breadth;
	 void setdim(int l,int b)
	{
		length=l;
		breadth=b;
	}
	 int getArea()
	{
		return length*breadth;
		 
	}
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int l = sc.nextInt();
	System.out.println("enter breadth");
	int b = sc.nextInt();
	Area r=new Area();
	r.setdim(l, b);
	System.out.println("Area of recangle:"+r.getArea());
}
}
