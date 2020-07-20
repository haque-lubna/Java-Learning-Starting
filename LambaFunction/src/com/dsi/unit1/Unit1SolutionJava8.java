package com.dsi.unit1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;



public class Unit1SolutionJava8 {

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
		Collections.sort(people , (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("After soting by last name: ");
		System.out.println(people.toString());
		
		
		//write a method to print all ele
		System.out.println("Printing all elements of the list: ");
		printConditionaly(people , p -> true);
//		
		//write a method which print whose last name starts with c
		System.out.println("People whoose last name starts with c: ");
		printConditionaly(people , p -> p.getLastName().startsWith("C"));
		
		System.out.println("all people with first name starts with C: ");
		printConditionaly(people, p -> p.getFirstName().startsWith("C"));
	}
    
	//using own interface
//	private static void printConditionaly(List<Person> people , Condition condition) {
//		for(Person p : people) {
//			if(condition.test(p)) {
//				System.out.println(p.toString());
//			}
//		}
//	}
	
	//using building predicate interface
	private static void printConditionaly(List <Person> people, Predicate <Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p.toString());
			}
		}
	}

}
