package javaprograms;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=21,i,count=0;
		for(i=1;i<=n;i++)
		{
		  if(n%i==0)
		  {
			  count++;
		  }
		}
		if(count==2)
			System.out.println("The given number is prime");
		else
			System.out.println("The given number is not prime");

	}

}
