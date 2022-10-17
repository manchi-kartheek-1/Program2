package P1;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeService implements EmployeeDAO
{
	public void displayEmployee()
	{
//		ArrayList<Employee> list = new ArrayList<Employee>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testptg", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("SELECT * FROM testptg.employeedao;");
			while(set.next())
            {
				System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getInt(3)+"\t"+set.getInt(4)+"\t"+set.getString(5));
//				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getExperience()+"\t"+e.getRole());
//              Employee employee=new Employee(set.getInt(1), set.getString(2), set.getInt(3), set.getInt(4),set.getString(5));
//              list.add(employee);
                
            }
//            for(Employee e:list)
//            {
//            	System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getExperience()+"\t"+e.getRole());
//            }
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void addEmployee(Employee employee)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testptg", "root", "root");
			Statement statement = connection.createStatement();
			int i= statement.executeUpdate("INSERT INTO `testptg`.`employeedao` (`id`, `name`, `salary`, `experience`, `role`) VALUES ('"+employee.getId()+"', '"+employee.getName()+"', '"+employee.getSalary()+"', '"+employee.getExperience()+"', '"+employee.getRole()+"');");
			if(i>0)
			{
				System.out.println("Data Inserted");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void deleteEmployee(Employee employee)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testptg", "root", "root");
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate("DELETE FROM `testptg`.`employeedao` WHERE (`id` = '"+employee.getId()+"');");
			if(i>0)
			{
				System.out.println("Data Deleteed");
			}
			else
			{
				System.out.println("Invalid id Entered");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void updateSalary(Employee employee)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testptg", "root", "root");
			Statement statement = connection.createStatement();
			int i= statement.executeUpdate("UPDATE `testptg`.`employeedao` SET `salary` = '"+employee.getSalary()+"' WHERE (`id` = '"+employee.getId()+"');");
			if(i>0)
			{
				System.out.println("Data Updated");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void updateExp(Employee employee)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testptg", "root", "root");
			Statement statement = connection.createStatement();
			int i= statement.executeUpdate("UPDATE `testptg`.`employeedao` SET `experience` = '"+employee.getExperience()+"' WHERE (`id` = '"+employee.getId()+"');");
			if(i>0)
			{
				System.out.println("Data Updated");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void updateRole(Employee employee) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testptg", "root", "root");
			Statement statement = connection.createStatement();
			int i= statement.executeUpdate("UPDATE `testptg`.`employeedao` SET `role` = '"+employee.getRole()+"' WHERE (`id` = '"+employee.getId()+"');");
			if(i>0)
			{
				System.out.println("Data Updated");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
