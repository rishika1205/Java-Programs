import java.util.Scanner;
public class numequal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int n3=sc.nextInt();
        System.out.println("Enter 4th number:");
        int n4=sc.nextInt();
        if(n1==n2 &&n2==n3 && n3==n4)
        {
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println("The numbers are not equal");
        }

    }
    
}
