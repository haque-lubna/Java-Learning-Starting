import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		//declare map
		Map <String , String> mp = new HashMap<String, String>();
		
		//insert map value key
		mp.put("Lubna", "Haque");
		mp.put("Rahim", "Karim");
		mp.put("Sadia", "Rima");
		mp.put("Sharmin", "Shefa");
		mp.put("Likhon", "Shikhon");
		System.out.println(mp);
		//return set view
		Set <Map.Entry<String, String>> st = mp.entrySet();
		//traverse map
		for(Map.Entry<String, String> element : st) {
			System.out.println(element.getKey() + " " + element.getValue());
		}
		
		//adding element into a map
		Map mp1 = new HashMap();  //default initialization. can insert any types of data
		Map <Integer , String> mp2 = new HashMap<Integer , String> ();  //initialization with generics
		
		//insert element
		mp1.put(1, "Lubna");
		mp1.put(2,"Haque");
		mp1.put(3,"Lubna");
		System.out.println(mp1);
		
		mp2.put(new Integer(1) , "Likhon");
		mp2.put(new Integer(2) , "Shikhon");
		mp2.put(new Integer(3) , "Shefa");
		mp2.put(new Integer(4) , "Shama");
		
		System.out.println(mp2);
		
		//changing element
		mp2.put(new Integer(4) , "Sadia");
		System.out.println(mp2);
		
		mp1.put(3,"Haque");
		System.out.println(mp1);
		
		//removing element
		mp1.remove(3);
		System.out.println(mp1);
		
		mp2.remove(4);
		System.out.println(mp2);
		
		//traversing into map
		for(Map.Entry element : mp2.entrySet()) {
			int key = (int) element.getKey();
			String value = (String) element.getValue();
			System.out.println(key + " " + value);
		}
		
		//differenet types of map
		//hash map. cant maintain the data order
		Map <String , Integer> hashMap = new HashMap<String, Integer> ();
		hashMap.put("Lubna" , 40);
		hashMap.put("Nammi" , 31);
		hashMap.put("Sweety" , 52);
		hashMap.put("Eshita" , 53);
		System.out.println("Hash Map: " + hashMap);
		
		//linkedhashmap. can maintain the order according to inserting order
		Map <String , Integer> linkedHashMap = new LinkedHashMap<String, Integer> ();
		linkedHashMap.put("Lubna" , 40);
		linkedHashMap.put("Nammi" , 31);
		linkedHashMap.put("Sweety" , 52);
		linkedHashMap.put("Eshita" , 53);
		System.out.println("Linked Hash Map : "+ linkedHashMap);
		
		//treemap. order according to the natural order. 
		Map <String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("Lubna" , 40);
		treeMap.put("Nammi" , 31);
		treeMap.put("Sweety" , 52);
		treeMap.put("Eshita" , 53);
		System.out.println("TreeMap : " + treeMap.entrySet());
	}

}
