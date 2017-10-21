import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("the line will be converted to upper case");
		String Name = sc.nextLine();
		String result = "";
		
		 
		 for(int i =0; i<Name.length(); i++)
		 {
			 int ch = Name.charAt(i);
			 if (Name.charAt(i)>96 && Name.charAt(i)<123){
				 
				 ch = Name.charAt(i) -32;
				 
			 }
			 result = result + (char)ch;
		 
		 }	
		 System.out.println(result);
		
		

	}

}
