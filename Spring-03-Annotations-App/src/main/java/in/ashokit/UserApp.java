package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.controller.UserController;

public class UserApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBeanDefinitionCount());
		String[] beanStrings = context.getBeanDefinitionNames();
		for(String bean:beanStrings) {
			System.out.println(bean);
		}
	}
}
