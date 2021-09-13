package maveentestA.project;

public class MainClass {
	public static void main(String[] args)
	{
		Employee first=new Employee();
		System.out.println("Name:"+first.getName());
		System.out.println("annualSalary:"+first.getAnnualSalary());
		System.out.println("yearOfJoining:"+first.getYearOfJoining());
		System.out.println("nin:"+first.getNin());
		
		System.out.println("\n");
		Employee second=new Employee("Rakesh",50000,2023,"Rbs");
		System.out.println("Name:"+second.getName());
		System.out.println("annualSalary:"+second.getAnnualSalary());
		System.out.println("yearOfJoining:"+second.getYearOfJoining());
		System.out.println("nin:"+second.getNin());
	}

}
