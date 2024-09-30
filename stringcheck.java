import java.util.Scanner;
public class stringcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String name=sc.nextLine();
        String input=name.replaceAll("\\s++","");
        String s="";
        for(int i=input.length() -1;i>=0;i--)
        {
            s+=input.charAt(i);
        }
        if(input.equals(s))
        {
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is Not palindrome");
        }
    }
}
