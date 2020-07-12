package collection;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ListInterface {

	public static void main(String[] args) {
		
		//List<String> List=new Vector<>();
		/*
		 * List.add("Puja"); List.add("Aklesh"); List.add("Nitu"); List.add("Puja");
		 */
		/*
		 * Set<String> set= new TreeSet<>();
		 * 
		 * set.add("Puja"); set.add("Aklesh"); set.add("Nitu"); set.add("Puja");
		 */
		
		Set<String> set= new LinkedHashSet<>();
		
		set.add("Puja");
		set.add("Aklesh");
		set.add("Nitu");
		set.add("Puja");
		for(String s:set)
		{
			System.out.println(s);
		}
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
