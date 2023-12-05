package com.project.Spring_Tests;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {


	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanCfg.class);
		//SpringApplication.run(Main.class, args);
//		Staff doc = context.getBean(Doctor.class);
		/*Nurse nur = (Nurse) context.getBean("nurse");
		/Staff staff = context.getBean(Doctor.class);
		/nur.assist();
		/staff.assist();*/
		Doctor doc = context.getBean(Doctor.class);
		doc.assist();
		doc.setQualification("MBBS");
		System.out.println(doc);
//		Doctor doc1 = context.getBean(Doctor.class);
//		System.out.println(doc1);
		//System.out.println(doc.getQualification());
	}

}
