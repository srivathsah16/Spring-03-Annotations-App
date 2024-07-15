package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.controller.Car;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public Car getCar() {
		//logic
		return new Car();
	}
}
