package Collection;

import java.util.Vector;

public class LearnVector {

	
	public static void main(String []args)throws Exception{
		
		Vector v = new Vector();
		v.add(4);
		v.add(8);
		v.add(56);
		v.add(90);
		v.add(4);
		v.add(8);
		v.add(56);
		v.add(90);
		v.add(4);
		v.add(8);
		v.add(56);
		v.add(90);
		v.add(4);
		v.add(8);
		v.add(56);
		v.add(90);
		
		
		v.remove(2);
		
		
		System.out.println(v.capacity());
		
		for (Object i : v){
			System.out.println(i);
			
			}
		
	}
}
