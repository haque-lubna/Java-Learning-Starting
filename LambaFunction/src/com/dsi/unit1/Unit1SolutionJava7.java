package com.dsi.unit1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.OMGVMCID;

public class Unit1SolutionJava7 {

	public static void main(String[] args) {
		List <Person> people = Arrays.asList(
				new Person("Charles" , "Diken" , 60),
				new Person("Lewis" , "Carral" , 42),
				new Person("Thomas" , "Carlyle" , 51),
				new Person("Charlotte" , "Bronte" , 45),
				new Person("Mathrew" , "Arnold" , 39)
				);
		System.out.println("Original list: ");
		System.out.println(people.toString());
		
		//sort by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		System.out.println("After soting by last name: ");
		System.out.println(people.toString());
		
		
		//write a method to print all ele
		System.out.println("Printing all elements of the list: ");
		printAllElement(people);
		
		//write a method which print whose last name starts with c
		System.out.println("People whoose last name starts with c: ");
		printAccordingToLastName(people);
		printConditionaly(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		System.out.println("all people with first name starts with C: ");
		printConditionaly(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
			
		});
	}

	private static void printAccordingToLastName(List<Person> people) {
		for(Person p : people) {
			String lastName = p.getLastName();
//			if(lastName.charAt(0) == 'C')
//				System.out.println(p.toString());
			if(lastName.startsWith("C"))
				System.out.println(p.toString());
		}
		
	}
	
	private static void printConditionaly(List<Person> people , Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p.toString());
			}
		}
	}

	private static void printAllElement(List<Person> people) {
		for(Person p : people) {
			System.out.println(p.toString());
		}
	}

}
interface Condition{
	boolean test(Person p);
}

