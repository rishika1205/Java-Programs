package javaprograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1221,sum=0,temp,i;
		temp=n;
		while(n!=0)
		{
			i=n%10;
			sum=sum*10+i;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is not palindrome");
	}

}
