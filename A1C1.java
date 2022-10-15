import java.util.Scanner;
public class A1C1 {
//How to accept different types of data using Scanner class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner-class, sc-object reference 
		Scanner sc=new Scanner(System.in);
		byte num1=sc.nextByte();
		short num2=sc.nextShort();
		int num3=sc.nextInt();
		long num4=sc.nextLong();
		float num5=sc.nextFloat();
		double num6=sc.nextDouble();
		char ch=sc.next().charAt(0);
		String s=sc.next(); //for first word from line
		String s1=sc.nextLine();   //for entire line
		
		
	}

}
