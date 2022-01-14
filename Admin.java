package employeepackage;

public class Admin {
	//member variable
	
	String A_name;
	int A_salary;
	
	//no arg constructor
	
	public Admin()
	{
		A_name="Raju";
		A_salary=35000;
	}
	
	//method
	
	public void printAdminData()
	{
		System.out.println( A_name + A_salary);
	}
	

}
