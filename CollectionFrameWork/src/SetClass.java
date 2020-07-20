
import java.util.*;

public class SetClass {
	enum setElement{
		cat,
		dog,
		bat,
		rat
	};

	public static void main(String[] args) {
		//set declare
		Set<String> st1 = new HashSet<String>();
		
		//add element
		st1.add("e");
		st1.add("Z");
		st1.add("z");
		st1.add("a");
		st1.add("p");
		System.out.println("Set1 is: " + st1);
		
		//2nd set
		Set<String> st2 = new HashSet<String>();
		st2.add("m");
		st2.add("N");
		st2.add("z");
		st2.add("a");
		st2.add("p");
		System.out.println("Set2 is: " + st2);
		
		// for union operation
		Set <String> unionSet = new HashSet<String> (st1);
		unionSet.addAll(st2);
		System.out.println("After union operation: " + unionSet);
		
		//intersection operation
		Set <String> intersectionSet = new HashSet <String> (st1);
		intersectionSet.retainAll(st2);
		System.out.println("After intersection: " + intersectionSet);
		
		//set difference
		Set <String> differenceSet = new HashSet <String> (st1);
		differenceSet.removeAll(st2);
		System.out.println("After set difference: " + differenceSet);
		
		//accessing element
		String findLetter = "Z";
		System.out.println("Contains " + findLetter + " within set1 is " + st1.contains(findLetter)); // returns boolean
		
		//remove element
		String removeLetter = "q"; 
		st1.remove(removeLetter); //if doesn't exist then nothing removed
		System.out.println("After removing " + removeLetter + " from set1: " + st1);
		
		//iterating through set using enhance for loop
		System.out.print("Printing element using loop: ");
		for(Object ele : st1) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		//add element from enum set
		Set <setElement> enumSet;
		enumSet = EnumSet.of(setElement.bat,setElement.cat,setElement.dog, setElement.rat);
		System.out.println("Printing the enum set: " + enumSet);
		
		//Linkedhashset
		//print data according to inseerted serial
		Set <String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("South Africa");
		linkedSet.add("India");
		linkedSet.add("Austrelia");
		linkedSet.add("South Africa");
		
//		for(Object element : linkedSet) {
//			System.out.print(element);
//		}
		
		Iterator <String> it = linkedSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//tree set
		//sorted in ascending order
        //can print descending order using method
		Set <String> treeSet = new TreeSet<String>();
		treeSet.add("India");
		treeSet.add("Bangladesh");
		treeSet.add("Polo");

		Iterator<String> it2 = treeSet.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();

	}

}
