package javaprograms;
import java.util.Scanner;
public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("Enter number 2:");
		int b=sc.nextInt();
		System.out.println("Enter number 3:");
		int c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("The number a:"+" "+a+" "+"is the greatest");
		}
		else if(b>a&&b>c)
		{
			System.out.println("The number b:"+" "+b+" "+"is the greatest");
		}
		else {
			System.out.println("The number c:"+" "+c+" "+"is the greatest");
		}
	}

}
