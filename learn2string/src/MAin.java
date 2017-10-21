





class Student {
	int rollno;
	String name;
	
	public Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
		}
	
	public String toString()
	{
		
		return rollno + " " + name;
	}
	}



public class MAin {
	public static void main(String[]args) {
		
		Student s1 = new Student(10, "nick");
		System.out.println();
		System.out.println(s1.toString());
	}

}
