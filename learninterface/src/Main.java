
interface A
{
int e = 100;
void dispa();
}

interface B
{
void dispb();	
}

class C implements A, B
{
	 public void dispa()
	{
		System.out.println("this is for a using multiple inheritance" + e);
		
	}
	 
	 public void dispb()
	 {
		 System.out.println("this is for B using multiple inheritance");
	 }
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.dispa();
		obj.dispb();
		

	}

}
