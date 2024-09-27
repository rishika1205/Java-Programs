package javaprograms;
class vehicle{
	public void drive()
	{
		System.out.println("the car is driving");
	}
}
	class car extends vehicle{
		public void drive()
		{
			System.out.println("Reparing a car");
		}
	}
public class Program4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car d1=new car();
		d1.drive();
				}

}
