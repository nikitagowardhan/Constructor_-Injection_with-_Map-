import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Question;

public class Test {

	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Question que = (Question) context.getBean("q");
		que.showInfo();
	}

}
