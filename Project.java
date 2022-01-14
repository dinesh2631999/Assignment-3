package departmentpackage;

public class Project {
	//member variable
	
	int no_of_project;
	int duration;
	
	//parameterized constructor
	
	public Project(int no_of_project,int duration)
	{
		this.no_of_project=no_of_project;
		this.duration=duration;
	}
	
	//method
	
	public void printProject()
	{
		System.out.println("no_of_project = " +no_of_project+ "Duration = "+duration);
	}

}
