package unit3;

import java.util.Arrays;
import java.util.List;

import com.dsi.unit1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List <Person> people = Arrays.asList(
				new Person("Charles" , "Diken" , 60),
				new Person("Lewis" , "Carral" , 42),
				new Person("Thomas" , "Carlyle" , 51),
				new Person("Charlotte" , "Bronte" , 45),
				new Person("Mathrew" , "Arnold" , 39)
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));

		
		long count = people.parallelStream()   //or stream(
		.filter(p -> p.getFirstName().startsWith("C"))
		.count();
		System.out.println(count);
	}

}
