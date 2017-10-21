import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("enter size");
		int n = obj.nextInt();
		int array[]= new int [n];
		System.out.println("lenght of array is" + array.length);
		System.out.println("enter the elements" + n);
		int i;
		
		for( i= 0; i< array.length; i++)
		{
			array[i] = obj.nextInt();
			
		}
		int total =0;
		for(i =0; i<array.length; i++)
		{
			System.out.println( array[i]);
			total = total + array [i];
			
		}
		
		System.out.println("total is" + total);
		
		

	}

}
