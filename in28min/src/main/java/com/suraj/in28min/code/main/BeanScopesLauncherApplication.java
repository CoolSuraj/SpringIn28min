package com.suraj.in28min.code.main;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Suraj:
 * This is an Example where the instance is of Spring Singleton (created by  Spring IOC container)
 * bean where you will get only one instance
 */
@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)  //This is syntax -- no need to mention it is by default
class NormalClass {
	
}

/**
 * 
 * this is example of multiple Instances created by Spring IOC container
 */
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}



@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(NormalClass.class)); //each time same instance will be called because by default singlton
			System.out.println(context.getBean(NormalClass.class));
			/**
			 * This will give different instance each time as we used Scope Prototype
			 */
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}

	}

}
