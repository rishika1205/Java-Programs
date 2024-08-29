package javaprograms;

public class Shape {
	int length,breadth;
	public void getArea() {
		length=5;
		breadth=4;
		int   area=length*breadth;
	}
	class rectangle extends Shape{
		public void getArea()
		{
		System.out.println(area);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a1=new Shape();
		a1.getArea();
		
	}

}
