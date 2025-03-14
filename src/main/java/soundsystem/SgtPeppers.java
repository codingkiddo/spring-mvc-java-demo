package soundsystem;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import jakarta.inject.Named;

@Named("lonelyHeartsClub-2")
@Component
public class SgtPeppers implements CompactDisc, BeanNameAware {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	private String beanName = ""; 
	
	@Override
	public void play() {
		System.out.println( this.beanName +  " Playing " + title + " by " + artist);
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		
	}

}
