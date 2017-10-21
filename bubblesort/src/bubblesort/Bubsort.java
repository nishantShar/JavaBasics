package bubblesort;

public class Bubsort {

	
	public void sorting(int b[])
	{
		int m = b.length;
		
		for( int p=1 ; p<m; p++)
		{
			for(int q= 0 ; q< m -p; q++)
			{
				if(b[q]>b[q+1])
					{
					int temp;
					temp = b[q];
					b[q] = b[q+1];
					b[q+1]= temp;
					
				}
				
			}
			
			
			
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {5,4,3,2,1};
		System.out.println("array before sorting");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + "");
			}
 Bubsort obj = new Bubsort();
 obj.sorting(a);
 
 System.out.println("array after sorting");
 for(int i= 0; i<a.length; i++)
 {
	 System.out.print(a[i] + "");
	 
 }
 
 
	}

}
