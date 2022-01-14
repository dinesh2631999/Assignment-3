package departmentpackage;

public class Department {
	//member variable
	
	String dept_name;
	
	//parameterized constructor
	
	public Department(String dept_name)
	{
		this.dept_name=dept_name;
	}
	
	//method
	
	public void printdeptData()
	{
		System.out.println(dept_name);
	}

}
