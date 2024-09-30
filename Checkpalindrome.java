import java.util.Scanner;
public class Checkpalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=scanner.nextLine();
        String input=s.replaceAll("\\s+","").toLowerCase();
        String reversed="";
        for(int i=input.length() -1;i>=0;i--)
        {
            reversed+=input.charAt(i);
        }
        if(input.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
