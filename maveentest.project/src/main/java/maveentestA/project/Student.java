package maveentestA.project;

public class Student {
	
	String name,address;
	int roll_no;
	int phone_no;


public static void main(String[] args)
{
	Student obj1=new Student();
	obj1.name="JOHN";
	obj1.roll_no=2;
	obj1.address="pkd";
	obj1.phone_no=5564646;
	
	Student obj2=new Student();
	obj2.name="SAM";
	obj2.roll_no=10;
	obj2.address="bbsr";
	obj2.phone_no=5564646;
	System.out.println("the details of "+obj1.name  +"\nroll:"+obj1.roll_no+"\naddress:"+obj1.address+ "\nphone_no "+obj1.phone_no );
	System.out.println("the details of "+obj2.name  +"\nroll:"+obj2.roll_no+"\naddress:"+obj2.address+ "\nphone_no "+obj2.phone_no );
}
}