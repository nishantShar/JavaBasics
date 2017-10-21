
class Nishant{
	
static int count = 0;
//	int count = 0;

public int check(){

	return count ++;
	
}
	
}


public class LearnStatic {

	public static void main(String[] args) {
		
		Nishant nis1 = new Nishant();
		Nishant nis2 = new Nishant();
		nis1.check();
		nis2.check();

		System.out.println(nis1.count);

		System.out.println(nis2.count);
		
	}

}
