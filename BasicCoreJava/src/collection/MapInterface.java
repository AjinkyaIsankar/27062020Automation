package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map= new HashMap<>();
		//Map<String, String> map= new Hashtable<>();
		
		map.put("name", "Ajinkya");
		map.put("email", "ajinkyaisankar@gmail.com");
		map.put(null,"QWERTY");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));

	}

}
