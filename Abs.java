abstract class A{
	
	void nick(){
		
		System.out.println("lets start");
	}
	
	abstract void nk();
}

class B extends A{
	
	void nk(){
		
		
	System.out.println("life is good");
	}
	
}





public class Abs {

	public static void main(String[] args) {
		
		A a = new B();
		a.nick();
		a.nk();

	}

}
