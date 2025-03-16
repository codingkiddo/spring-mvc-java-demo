package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "soundsystem")
public class CDPlayerConfig {
	
	@Bean(name="lonelyHeartsClubBand")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	
}
