


 class Main {
	int a,b;
	
	void getdata(int x, int y)
	{
		a=x;
		b=y;
	}
	
	void add()
	{
		int c;
		c=a+b;
		System.out.println("the summation is"+"\t"+c);
		
	}
	

}
 
 class Test
{
public static void main(String[] args)
{
	Main obj= new Main();
	obj.getdata(100,90);
	obj.add();
	}

}

