import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		GregorianCalendar call = new GregorianCalendar();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your hire year(yyyy):");
           int hireyear = input.nextInt();
           int currYear = call.get(GregorianCalendar.YEAR);
           System.out.println("currYear" +" " + currYear);
           System.out.println("hireyear" +" " + hireyear);
           System.out.println("time you are working from" + " "+ (currYear-hireyear));
           
	}

}
