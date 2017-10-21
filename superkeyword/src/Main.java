class A
{
	int no;
	 void message()
	 {
		 System.out.println("no in super class"+ no);
	 }
}

class B extends A
{
int no;
B(int a, int b)
{
	super.no =a;
	no= b;
	
}

void message()
{
	
System.out.println("no in subclass" + no );
}
void disp()
{
	super.message();
	message();
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B(100, 200);
		obj.disp();

	}

}
