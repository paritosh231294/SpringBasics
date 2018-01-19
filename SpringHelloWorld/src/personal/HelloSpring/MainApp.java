package personal.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld)ctx.getBean("helloWorld");
		System.out.println(obj.getMessage());
		

	}

}
