package uppercaselowercasecount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
String S = "Tell Me The Number Of Uppercase and Lowercase";
int uppercase= 0; int lowercase = 0;

for( int i = 0; i < S.length(); i++)
{ 
char j = S.charAt(i);


	{
		if(j>=65 && j<=90){uppercase ++;}
		if(j>=97 && j <= 122){lowercase++;}
		
	
	}
	}




System.out.println("Uppercase are" + uppercase); System.out.println("lowercase are"+ lowercase);

	}

}
