import java.util.Scanner;

public class Main {
public static void main(String a[])
{
	

Scanner s1 = new Scanner(System.in);
System.out.println("Enter the string");
String p = s1.nextLine();
int count;

for(int i =0; i<p.length(); i++)
{
	if((p.charAt(i)=='a')||(p.charAt(i)=='e')||(p.charAt(i)=='i')||(p.charAt(i)=='o')||(p.charAt(i)=='u'))
	{
		System.out.println("vowel found is"+" "+p.charAt(i)+" "+"at position" +" "+ i);
	}

}



}

}
