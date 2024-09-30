import java.util.Scanner;
public class Concatestring {
    String s1,s2;
    public static void main(String args[])
    { 
        String s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        System.out.println("Enter another string:");
        String s2=sc.nextLine();
        s3=s1+s2;
        System.out.println("The string after concatinating is :"+s3);
    }
    
}
