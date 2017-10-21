
import java.lang.*;



class A extends Thread
{
	public void run()
	{
		int i;
		
		for (i=0; i<5; i++)
		{
			System.out.println("from A"+ i);
			
		}
		System.out.println("exit from A");
		
	}
}

class B extends Thread
{
	
public void run()
{
	int i;
	for (i=0; i<5; i++)
	{
		System.out.println("from B"+ i);
		
	}
	System.out.println("exit from B");

}

}

public class learnthreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1= new A();
		B obj2= new B();
		
		obj1.start();
		obj2.start();

	}

}
