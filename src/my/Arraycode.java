package my;

import java.util.Scanner;

public class Arraycode {

	public static void main(String[] args) {
		int a[]=new int[30];
		int c1=0,c2=0,c3=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your array");
		for(int i=1;i<30;i++) {
			a[i]=i;
		}
		System.out.print("your array is ");
		for(int i=1;i<30;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for(int i=1;i<30;i++) {
			if(i%3==0) {
				c1++;
			}
			if(i%4==0) {
				c2++;
			}
			if(i%5==0) {
				c3++;
			}
		}
		System.out.print("Number divisible by 3 are ");
		System.out.println(c1);
		System.out.print("Number divisible by 4 are ");
		System.out.println(c2);
		System.out.print("Number divisible by 5 are ");
		System.out.println(c3);
	}

}
