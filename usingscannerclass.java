package javaprograms;

import java.util.Scanner;

public class usingscannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter student name:");
		 String s=input.nextLine();
		 System.out.println("Enter student sec:");
		 String sec=input.nextLine();
		 System.out.println("Enter student branch:");
		 String branch=input.nextLine();
		 Scanner input1= new Scanner(System.in);
		 System.out.println("Enter student roll number:");
		 int id=input1.nextInt();
		 System.out.println("Enter student fees:");
		 double num=input1.nextDouble();
		 System.out.println("Enter student cgpa:");
		 float score=input1.nextFloat();
		 System.out.println("Student name is :"+" "+s);
		 System.out.println("Student roll number is:"+" "+id);
		 System.out.println("Student branch is:"+" "+branch);
		 System.out.println("Student section is:"+" "+sec);
		 System.out.println("Student fees:"+num);
		 System.out.println("Student cgpa is:"+score);
		 input.close();
	}

}
