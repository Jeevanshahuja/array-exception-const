package my;
import java.util.Scanner;

public class ExceptionNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers");
		int a,b,c;
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Sahi se likh le bhai");
		}
	}

}
