import java.util.*;
class ArrayListPrg {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Pineapple");
		fruits.add("Strawberry");
		fruits.add("Cherry");
		
		for(String f: fruits)
		{
			System.out.println(f);
		}	
	}
}
