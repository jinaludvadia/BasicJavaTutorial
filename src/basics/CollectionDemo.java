package basics;

import java.util.HashMap;
import java.util.Scanner;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		HashMap<Integer,String> h2 = new HashMap<Integer,String>();
		HashMap<Integer,String> h3 = new HashMap<Integer,String>();
		
		h1.put(1, "Cat");
		h1.put(2, "Dog");
		h1.put(3, "Goat");
		h1.put(4, "Cow");
		
		h2.put(1, "Dog");
		h2.put(2, "Bear");
		h2.put(3, "Lion");
		h2.put(4, "Cow");
		h2.put(5, "Tiger");
		
		h3.put(1, "Cat");
		h3.put(2, "Dog");
		h3.put(3, "Goat");
		h3.put(4, "Cow");
		
		//Compare HashMaps
		compare(h1,h2);
		compare(h1,h3);
		
		//Get value when key is given
		System.out.print("Enter key :");
		int key = sc.nextInt();
		getValue(h1,key);
		
		//Add value at the user given position
		System.out.print("Enter key :");
		int key2 = sc.nextInt();
		System.out.print("Enter value :");
		String value = sc.next();
		h2 = putValue(h2,key2,value);
		
	}
	
	static void compare(HashMap<Integer,String> h1,HashMap<Integer,String> h2) {
		if(h1.equals(h2)) {
			System.out.println("Equal Hashmaps");
		}else {
			System.out.println("Unequal Hashmaps");
		}
	}
	
	static void getValue(HashMap<Integer,String> h, int key) {
		if(h.containsKey(key)) {
			System.out.println("The value is: "+ h.get(key));
		}else {
			System.out.println("Invalid Key");
		}
	}
	
	static HashMap<Integer,String> putValue(HashMap<Integer,String> h, int key, String value){
		h.put(key, value);
		System.out.println("\n Updated hashmap:"+ h);
		return h;
	}

}
