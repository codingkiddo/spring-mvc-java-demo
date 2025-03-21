package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MinstrelMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
		
		Knight knight = applicationContext.getBean(Knight.class);
		knight.embarkOnQuest();
		
		applicationContext.close();
		
	}

}
