package employeepackage;

public class Manager {
	//member variable
	
	String m_name;
	int m_salary;
	
	//parameterized constructor
	
	public Manager(String m_name,int m_salary)
	{
		this.m_name=m_name;
		this.m_salary=m_salary;
	}
	
	//method
	
	public void printManager()
	{
		System.out.println(m_name + m_salary);
	}

}
