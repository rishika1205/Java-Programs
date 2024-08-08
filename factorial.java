package javaprograms;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the given number is :"+fact);
	}

}
