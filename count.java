package javaprograms;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="The Greatest Day";
		int count=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)!=" ")
				count++;
		}
		System.out.println("Total number of characters in a string:"+count);
	}

}
