//
//public class test {
//	public static void main(String[]args)
//	{
//		System.out.println("hello");
//	}
//
//}






import java.util.Scanner;


class Nishant{



	public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Options\n");
            System.out.println("(1) - do this");
            System.out.println("(2) - quit");

            System.out.print("Please enter your selection:\t");
            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 1) {
                System.out.print("Enter a sentence:\t");
                String sentence = scanner.nextLine();

                System.out.print("Enter an index:\t");
                int index = scanner.nextInt();

                System.out.println("\nYour sentence:\t" + sentence);
                System.out.println("Your index:\t" + index);
            }
            else if (selection == 2) {
                break;
            }
        }
    }
}

class test {
	
		public static void main(String[]args){
			
			Nishant t = new Nishant();
			t.menu();
	
    
}
}