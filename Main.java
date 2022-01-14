package departmentpackage;
import employeepackage.Employee;
import employeepackage.Manager;
import employeepackage.Admin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for employee class
		Employee employee=new Employee(20,1234,12000);
		employee.printempData();
		
		// for manager class
		Manager manager=new Manager("Mathan",5000);
		manager.printManager();
		
		// for admin class
		
		Admin admin=new Admin();
		admin.printAdminData();
		
		//for dept class
		
		Department department=new Department("Testing");
		department.printdeptData();
		
		//for project class
		Project project=new Project(10,30);
		project.printProject();

	}

}
