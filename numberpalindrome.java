import java.util.Scanner;
public class numberpalindrome {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            i=n%10;
            sum=sum*10+i;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }
    }
}
