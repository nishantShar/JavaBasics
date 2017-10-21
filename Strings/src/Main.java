
public class Main {
	
	public static void main(String[]args)
	{
		String str1 = "I am the best";
		String str2 = new String ("JAVA");
		
		char name[] = { 'N','I', 'S', 'H', 'U'};
		String str3 = new String(name);
		String str4 = new String(name, 2,3);
		String str5 = new String(str4);
		
		System.out.println("string:"+str1);
		System.out.println("string:"+str2);
		System.out.println("string :"+str3);
		System.out.println("string :"+str4);
		System.out.println("string :"+str5);
		System.out.println("string lenght :"+str1.length());
		
		
		
	}

}
