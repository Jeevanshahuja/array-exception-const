package my;
class Testcons{
	public Testcons(){
		System.out.println("Hi from constructor body");
	}
	public Testcons(int a,int b) {
		int c=a+b;
		System.out.print("sum is ");
		System.out.println(c);
	}
}

public class Constructorcode {

	public static void main(String[] args) {
		new Testcons();
		new Testcons(12, 15);
		
	}

}
