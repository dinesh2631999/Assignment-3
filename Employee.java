package employeepackage;

public class Employee {
	//member variable
	
	int no_of_emp;
	int empid;
	int empsalary;
	
	//parameterized constructor
	
	public Employee(int no_of_emp,int empid,int empsalary)
	{
		this.no_of_emp=no_of_emp;
		this.empid= empid;
		this.empsalary=empsalary;
	}
	
	//member function or method
	public void printempData()
	{
		System.out.println("no_of_emp = " +no_of_emp+" empid = " + empid+ " empsalary = " +empsalary);
	}
	

}
