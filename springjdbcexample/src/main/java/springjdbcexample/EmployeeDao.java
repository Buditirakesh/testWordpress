package springjdbcexample;
import springjdbcexample.Employee;
public interface EmployeeDao {
	public Employee findEmployeeById(int empId);

}
