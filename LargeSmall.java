package javaprograms;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[] {55,32,45,98,82,11,9};
		int i;
		int smallest=number[0];
		int largest=number[0];
		for(i=1;i<number.length;i++)
		{
			if (number[i]>largest)
				largest=number[i];
			else if(number[i]<smallest)
				smallest=number[i];
		}
		System.out.println("Largest number is :"+largest);
		System.out.println("Smallest number is :"+smallest);
	}

}
