import java.io.*;
public class FileDemo {
	 public static void main(String a[]) {
	        File f1 = new File("C:\\Users\\hp\\workspace");
	        File f2 = new File("C:\\Users\\hp\\workspace\\scanner\\src\\test.java");
	         
	        if(f1.isDirectory()) {
	            String arr[] = f1.list();
	            for(int i=0;i<arr.length;i++) {
	                File temp = new File(f1.getAbsolutePath() + "/" + arr[i]);
	                System.out.println(arr[i] + "-->" + (temp.isDirectory() ? "DIR" : "File"));
	            }
	        }
	         
	        System.out.println("DOC files...");
	         
	       // String arr2[] = f1.list(new Extension(a[0]));
	        //for(int i=0;i<arr2.length;i++)
	            //System.out.println(arr2[i]);
	    }

}
