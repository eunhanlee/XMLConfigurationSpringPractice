package com.example.XMLConfigurationSpringPractice;

import com.example.XMLConfigurationSpringPractice.models.Animal;
import com.example.XMLConfigurationSpringPractice.models.Owner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlConfigurationSpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlConfigurationSpringPracticeApplication.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Owner o = ac.getBean(Owner.class);
		Animal a = ac.getBean(Animal.class);
		System.out.println(a);
		a.setType("Ladybug");
		a.setName("Luna");
		a.setWeight(1);
		a.setColor("Red");
		a.getOwner().setName("Han");
		a.getOwner().setAge(24);

		System.out.println(a);

		Animal a2 = ac.getBean(Animal.class);
		System.out.println(a2);
		a2.setName("Cornelius");
		a2.setWeight(5);
		System.out.println(a);
		System.out.println(a2);
	}

}
