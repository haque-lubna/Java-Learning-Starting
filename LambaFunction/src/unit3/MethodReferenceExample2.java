package unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.dsi.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List <Person> people = Arrays.asList(
				new Person("Charles" , "Diken" , 60),
				new Person("Lewis" , "Carral" , 42),
				new Person("Thomas" , "Carlyle" , 51),
				new Person("Charlotte" , "Bronte" , 45),
				new Person("Mathrew" , "Arnold" , 39)
				);

		//write a method to print all ele
		System.out.println("Printing all elements of the list: ");
		performConditionaly(people , p -> true , System.out :: println);

	}
	
	//using building predicate interface
	private static void performConditionaly(List <Person> people, Predicate <Person> predicate , Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}


	