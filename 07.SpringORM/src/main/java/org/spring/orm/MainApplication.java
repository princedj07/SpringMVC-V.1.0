package org.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.spring.orm.dao.StudentDao;
import org.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("hibernateConfig.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student insert = new Student();
		insert.setStuName("Lakhan");
		insert.setCity("Pune");
		insert.setState("Maharastra");
		
//		int insert = studentDao.insert(student);
//		System.out.println("Record inserted--? "+insert);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean switchcase = true;
		while (switchcase) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all student");
			System.out.println("PRESS 3 for get details of single student");
			System.out.println("PRESS 4 for delete single student");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for exit");	
			System.out.println("********************************************************");
			try {
				int input = Integer.parseInt(reader.readLine());
				
				switch(input) {
					case 1:
						//add new student
						studentDao.insert(insert);
						break;
					case 2:
						//display all student
						studentDao.getAllStudentList();
						break;
					case 3:
						//display single student
						studentDao.getStudentData(4);
						break;
					case 4:
						//delete single student
						studentDao.deleteStudentData(3);
						break;
					case 5:
						//update single student
						Student student = new Student();
						student.setStuId(1);
						student.setStuName("Prince DJ");
						student.setCity("MUMBAI");
						student.setState("MAHARASTRA");
						studentDao.updateStudentData(student);
						break;
					case 6:
						//Exit
						switchcase = false;
						break;						
				}
				
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Invalid input");
			}
		}

		System.out.println("\nThank You for using my application");
		System.out.println("\n********************************************************");
	}

}
