package maveentestA.project;

public class Employee extends Person {
	private double annualSalary;
	private int yearOfJoining;
	private String nin;
	Employee()
	{
		super();
		this.annualSalary=0.0;
		this.yearOfJoining=0000;
		this.nin="not provided";
	}
	Employee(String name,double annualSalary,int yearOfJoining,String nin)
	{
		super(name);
		this.annualSalary=annualSalary;
		this.yearOfJoining=yearOfJoining;
		this.nin=nin;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getNin() {
		return nin;
	}
	public void setNin(String nin) {
		this.nin = nin;
	}

}
