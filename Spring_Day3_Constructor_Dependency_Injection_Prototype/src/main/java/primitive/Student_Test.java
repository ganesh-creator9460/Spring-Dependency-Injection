package primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Test {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = (Student) ap.getBean("stu");
		
		System.out.println(s);
		
		Student s1 = ap.getBean(Student.class);
		System.out.println(s1);
		
		
	}
}
