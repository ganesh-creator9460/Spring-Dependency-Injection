package primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Test {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
		Student s = ap.getBean(Student.class);
		System.out.println(s.getName());
		System.out.println(s.getRollno());
	}
}
