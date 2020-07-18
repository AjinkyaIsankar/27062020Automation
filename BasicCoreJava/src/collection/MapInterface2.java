package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) {
		
		//1 - Ajinkya
		//2 - Prachee
		//3 - Anshika
		
		Map<Integer, String> std = new HashMap<>();
		
		std.put(1, "Ajinkya");
		std.put(2, "Prachee");
		std.put(1, "Anshika");
		
		System.out.println(std.get(2));
		
		Set<Integer> set = std.keySet();
		
		for(int key:set)
		{
			System.out.println(std.get(key));
		}
	}

}
