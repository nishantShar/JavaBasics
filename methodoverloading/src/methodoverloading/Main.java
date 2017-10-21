package methodoverloading;

class Test
{

void mult(int x)
{
	 int a;
	a=x;
	System.out.println("The square is"+(a*a));
}
void mult (int x, int y)
{
	int a,b,c;
	a=x;
	b=y;
	c=a+b;
	
System.out.println("the sum is"+ c);
	}

}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj= new Test();
		obj.mult(8);
		obj.mult(45,45);

	}

}
