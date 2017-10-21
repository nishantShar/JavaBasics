package Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception {
		
		
//		Collection<Integer> c = new  ArrayList <Integer>();
		
		List<Integer> c = new ArrayList<Integer>();

		c.add(10);
		c.add(11);
		c.add(12);
		c.add(1,98);
		c.add(2,71);
		c.add(3,69);
		
		Comparator<Integer> com = (Comparator<Integer>) new Comptr();
		
		Collections.sort(c,com);
//		c.add("Nishant");(this will give error because collection only wants integer)
		
//Iterator i = c.iterator();
//		
//		while(i.hasNext()){
//			 
//			System.out.println(i.next());
//
//			System.out.println(i.next());
//
//			System.out.println(i.next());
//		}
		
//		
//		Advanced for loop
		for(Integer o : c){
			System.out.println(o);
		}
	
		
		//lambda expression 
		
//		c.forEach(System.out::println);
		
		
		
	}

}
