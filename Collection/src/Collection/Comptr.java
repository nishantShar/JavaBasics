package Collection;

import java.util.Comparator;

public class Comptr implements Comparator <Integer> {
	


	@Override
	public int compare(Integer O1, Integer O2) {
		
		
//		if(O1%10>O2%10) sort by last digit
//		{return 1;}
		
		//sortting by last two digits
		if(O1%100>O2%100)
		{
			return 1;
		}
		else return -1;
		
	}
}