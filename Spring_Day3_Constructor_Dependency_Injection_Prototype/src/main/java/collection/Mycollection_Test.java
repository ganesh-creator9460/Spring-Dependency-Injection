package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mycollection_Test {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans2.xml");
		Mycollection mc = ap.getBean(Mycollection.class);
		System.out.println(mc);
	}
}
