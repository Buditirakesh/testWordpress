

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(HelloConfig.class);
		Hello hello = (Hello)context.getBean("hello");
		hello.setMessage(" This is my First Maven Project");
		System.out.println(hello.getMessage());
	}

}
