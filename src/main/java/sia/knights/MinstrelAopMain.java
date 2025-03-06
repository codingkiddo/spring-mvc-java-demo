package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MinstrelAopMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("META-INF/spring/minstrel-aop.xml");
		
		Knight knight = applicationContext.getBean(Knight.class);
		knight.embarkOnQuest();
		
		applicationContext.close();
		
	}

}
