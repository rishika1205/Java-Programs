package javaprograms;

public class Dog {
	String name,colour;
public Dog(String n1,String c1) {
		name=n1;
		colour=c1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myObj=new Dog("Scoopy","white");
		System.out.println(myObj.name);
		System.out.println(myObj.colour);
	}

}
