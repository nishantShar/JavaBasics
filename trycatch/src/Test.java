

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test { 
public static void main(String[] args) throws IOException {
		

//	//Scanner obj = new Scanner(System.in);
//	//System.out.println("Enter the values of a and b");
//	//a = obj.nextInt();
//	//b = obj.nextInt();
	
	int arr[]= new int[4];
	
//	int p,q,r;
//	p=8;
//	r=0;
//	
//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	String test = br.readLine();
//
//
//	 q = Integer.parseInt(test);
	
	try{
	
//				System.out.println ("Enter value");
//				//Scanner sc = new Scanner(System.in);
//				
//				r=p/q;
//				
	for(int i=0;i<10;i++){
		
		arr[i]= i;
	}
	
	for(int values: arr){
		
		
		System.out.println(values);
	}
   	}
	
//	catch(ArithmeticException e){
//		System.out.println(e);
//	}
	catch(ArrayIndexOutOfBoundsException e){
		
		System.out.println(e);
}
			
			catch(Exception e){
				System.out.println(e);//
				
				 
			}
	
	finally{
		System.out.println("Bye");
	}
 		
	
	
}
}
//	try
//	{
//		a= Integer.parseInt(args[0]);
//		b= Integer.parseInt(args[1]);
//		try{
//			
//			ans= a/b;
//			System.out.println("Result" + ans);
//		}
//	
//		catch(ArithmeticException e)
//		
//		{
//			System.out.println("divison by zero");
//		}
//	}
//		
//		catch(NumberFormatException e)
//		{
//			
//			System.out.println("incorrect argument");
//		}
//	
//	finally
//	{
//		System.out.println("Out of the world");
//		
//	}
//}
//}