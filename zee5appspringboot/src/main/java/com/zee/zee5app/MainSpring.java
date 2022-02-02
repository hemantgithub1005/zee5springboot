package com.zee.zee5app;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.zee.zee5app.config.Config;
import com.zee.zee5app.repository.UserRepository;

public class MainSpring {
	
	public static void main(String []args)
	{
		//java based config
		AbstractApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		UserRepository userRepository=applicationContext.getBean(UserRepository.class);
		System.out.println(userRepository);
		UserRepository userRepository2=applicationContext.getBean(UserRepository.class);
		
		System.out.println(userRepository2);
		
		System.out.println(userRepository.hashCode());
		System.out.println(userRepository2.hashCode());
		System.out.println(userRepository.equals(userRepository2));
		
	    DataSource dataSource=applicationContext.getBean("dataSource",DataSource.class);
	    System.out.println(dataSource!=null);
	    
		applicationContext.close();
	}

}
