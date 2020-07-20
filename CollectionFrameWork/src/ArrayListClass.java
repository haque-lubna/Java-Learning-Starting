import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
	public static void main(String[] args) {
		//declare arraylist
		List <String> arrayList = new ArrayList<String> ();
		//add element
		arrayList.add("Shefa");
		arrayList.add("Shama");
		arrayList.add("Likhon");
		arrayList.add("Shikhon");
		arrayList.add(2, "Rozi"); //define the index number
		
		arrayList.set(1, "Sadia");  //change elemnt 
		
		arrayList.remove(1); //removing using index number
		arrayList.remove("Likhon");  //removing using object
		System.out.println(arrayList);
		
		//iterating on array list
		for(int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i) + " ");  //using get method
		}
		System.out.println();
		
		for(String element : arrayList) { //using enhance for loop
			System.out.print(element + " "); 
		}
		System.out.println();
		
		//different types of constructor of array list
		ArrayList list1 = new ArrayList();    //create empty array list
		ArrayList list2 = new ArrayList(list1);  //insert list1 into list2
		ArrayList list3 = new ArrayList(10);   //initialize the capacity of array list
		ArrayList <String> list4 = new ArrayList<String>();  //constructor with generic class
		
	}
}
