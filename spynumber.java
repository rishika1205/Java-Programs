import java.util.Scanner;
public class spynumber {
    public static void main(String[] args) {
        int sum=0,prod=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(n>0)
        {
            int i=n%10;
            sum=sum+i;
            prod=prod*i;
            n=n/10;
        }
        if(prod==sum)
        {
            System.out.println("The number is SPY number");
        }
        else
        {
            System.out.println("The number is NOT SPY number");
        }
    }
    
}
