package javaprograms;

public class constructor2 {
//to create a constructor using parameters
	int x;
	public constructor2(int y)
	{
		x=y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor2 myObj=new constructor2(10);
		System.out.println(myObj.x);
	}

}
