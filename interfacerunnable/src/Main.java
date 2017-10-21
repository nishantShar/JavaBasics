



class Test implements Runnable
{
	public void run()
	{
		
	for(int i=1 ; i <=5 ;i++)	
	{
		System.out.println("Test thread");
		}
		
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t = new Test();
Thread obj = new Thread(t);
obj.start();

for(int i=1; i<=5; i++)
{
	System.out.println("main thread");
}
	}

}
