package P1;
import java.util.Scanner;
public class EmployeeController
{
	static Employee employee = new Employee();
	static Scanner sc = new Scanner(System.in);
	public static void process()
	{
		System.out.println("Enter\n1.Add\n2.Display\n3.Update\n4.Delete\n5.Exit");
		int p = sc.nextInt();
		switch(p)
		{
		case 1:addData();break;
		case 2:displayData();break;
		case 3:updateData();break;
		case 4:deleteData();break;
		case 5:System.out.println("Thank You");break;
		default:System.out.println("Invalid Selection\nPlease Select Again");process();break;
		}
	}
	public static void again()
	{
		System.out.println("Would You Like to continue Press\n1.Continue\n2.Exit");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:process();break;
		case 2:System.out.println("Thank You");break;
		default:System.out.println("Invalid Selection\nPlease Select Again");again();break;
		}
	}
	public static void displayData()
	{
		service.displayEmployee();
		again();
	}
	public static void addData()
	{
		System.out.print("Enter Employee Name:");
		employee.setName(sc.next());
		System.out.print("Enter Employee Salary:");
		employee.setSalary(sc.nextDouble());
		System.out.print("Enter Employee Experience:");
		employee.setExperience(sc.nextInt());
		System.out.print("Enter Employee Role:");
		employee.setRole(sc.next());
		service.addEmployee(employee);	
		again();
	}
	public static void deleteData()
	{
		System.out.print("Enter Employee ID to Delete:");
		employee.setId(sc.nextInt());
		service.deleteEmployee(employee);	
		again();
	}
	public static void updateData()
	{
		System.out.println("Enter Given Below for Update\n1.Salary\n2.Experience\n3.Role");
		int u = sc.nextInt();
		switch(u)
		{
		case 1 : updateSalary();break;
		case 2 : updateExp();break;
		case 3 : updateRole();
		default : System.out.println("Invalid Selection\nPlease select Again");updateData();break;
		}
	}
	public static void updateSalary()
	{
		System.out.print("Enter id:");
		employee.setId(sc.nextLong());
		System.out.print("Enter Employee Salary to update:");
		employee.setSalary(sc.nextDouble());
		service.updateSalary(employee);
		again();
	}
	public static void updateExp()
	{
		System.out.print("Enter id:");
		employee.setId(sc.nextLong());
		System.out.print("Enter Employee Experience to update:");
		employee.setExperience(sc.nextInt());
		service.updateExp(employee);
		again();
	}
	public static void updateRole()
	{
		System.out.print("Enter id:");
		employee.setId(sc.nextLong());
		System.out.print("Enter Employee Role to update:");
		employee.setRole(sc.next());
		service.updateRole(employee);
		again();
	}
	static EmployeeService service = new EmployeeService();
	public static void main(String[] args)
	{
		process();
	}
}