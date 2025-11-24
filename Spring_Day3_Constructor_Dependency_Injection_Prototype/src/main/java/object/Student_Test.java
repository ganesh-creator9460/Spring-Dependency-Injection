package object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Test {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans1.xml");
		Student student = ap.getBean(Student.class);
		System.out.println(student);
	}
}
