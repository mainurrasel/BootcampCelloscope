package com.spring.jdbc.main;

import java.util.List;
import java.util.Random;

import com.spring.jdbc.dao.EmployeeDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.model.Employee;

public class SpringMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDAO employeeDAO = ctx.getBean("employeeDAOJDBCTemplate", EmployeeDAO.class);

		Employee emp = new Employee();
		int rand = new Random().nextInt(1000);
		emp.setId(rand);
		emp.setName("naz");
		emp.setRole("Java Developer");
		

		employeeDAO.save(emp);
		

		Employee emp1 = employeeDAO.getById(rand);
		System.out.println("Employee Retrieved::"+emp1);
		

		emp.setRole("CEO");
		employeeDAO.update(emp);
		

		List<Employee> empList = employeeDAO.getAll();
		System.out.println(empList);
		

		//employeeDAO.deleteById(rand);
		

		ctx.close();
		
		System.out.println("DONE");
	}

}
