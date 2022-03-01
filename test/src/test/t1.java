package test;
import java.util.Scanner;
public class t1 {

	public t1() {
		// TODO Auto-generated constructor stub
	}

	public class JavaCodeExam {
		 public static void main(String[] args) throws Exception {
		  Scanner in = new Scanner(System.in);
		  System.out.print("Input Time : ");
		  int time = in.nextInt();
		  for (int i = time; i >= 0; i--) {
		   Thread.sleep(1000);
		   System.out.print(i + " ");
		  }
		  Thread.sleep(1000);
		  System.out.println("Success");
		 }
		}

}
