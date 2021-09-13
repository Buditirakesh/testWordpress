

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
	
	@Bean("hello")
	public Hello getHello() {
		return new Hello();
	}

}
