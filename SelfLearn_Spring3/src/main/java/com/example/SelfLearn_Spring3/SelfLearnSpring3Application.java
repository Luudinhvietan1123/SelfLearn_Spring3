package com.example.SelfLearn_Spring3;

import com.example.SelfLearn_Spring3.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//Scan chi trong 1 package
//@ComponentScan("com.example.SelfLearn_Spring3.others")
//Cach 2: @SpringBootApplication(scanBasePackages = "com.example.SelfLearn_Spring3.others")

//MultipleScan
//@ComponentScan({"com.example.SelfLearn_Spring3.others", "com.example.SelfLearn_Spring3"})
@SpringBootApplication
public class SelfLearnSpring3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SelfLearnSpring3Application.class);
		try{
			Girl girl = context.getBean(Girl.class);
			System.out.println("Bean: " + girl.toString());
		}catch(Exception e){
			System.out.println("Bean girl khong ton tai!");
		}

		try{
			OtherGirl otherGirl = context.getBean(OtherGirl.class);
			System.out.println("Bean: " + otherGirl.toString());
		}catch(Exception e){
			System.out.println("Bean girl khong ton tai!");
		}
	}

}
