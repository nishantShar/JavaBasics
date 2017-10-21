import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1 = new Scanner(System.in);
System.out.println("Enter the string ");
String str1 = s1.nextLine();
//s1.close();

//Scanner s2 = new Scanner(System.in);
System.out.println("enter part to be replaced");

String str2 = s1.nextLine();
//s2.close();


System.out.println("replace with");
//Scanner s3 = new Scanner(System.in);
String str3 = s1.nextLine();
//s3.close();


str1 = str1.replace(str2,str3);
System.out.println(str1);
	}

}
