package com.dsi.LearnSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	Vehicle obj = new Car();
//    	obj.drive();
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car obj = (Car) context.getBean("car");
    	obj.drive();
    	
//    	Tyre tyre = (Tyre) context.getBean("tyre");
//    	System.out.println(tyre);
    }
}
