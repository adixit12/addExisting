package practise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("A",1,"12-10-2020");
		Employee employee2 = new Employee("B",1,"12-10-2020");
		Employee employee3 = new Employee("C",1,"12-10-2020");
		Employee employee4 = new Employee("D",1,"12-10-2020");
		Employee employee5 = new Employee("E",1,"12-10-2020");
		
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		
		for(Employee employee:list)
		{
			System.out.println(employee);
		}


	}

}
