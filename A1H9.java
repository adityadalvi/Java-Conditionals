import java.util.Scanner;
public class A1H9 {
//Write a program to develop a simple calculator application and perform some basic operations (Variations)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		/*System.out.println("for addition enter 1\nfor subtraction enter 2\nfor multiplication enter 3\nfor division enter 4");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println("addition : "+(num1+num2));
		}
		else if(op==2)
		{
			System.out.println("addition : "+(num1-num2));
		}
		else if(op==3)
		{
			System.out.println("addition : "+(num1*num2));
		}
		else if(op==4)
		{
			System.out.println("addition : "+(num1/num2));
		}*/
		
		int num3=sc.nextInt();
		switch(num3)
		{
			case 1:
				System.out.println("addition : "+(num1+num2));
				break;
			case 2:
				System.out.println("Subtraction : "+(num1-num2));
				//break;
			case 3:
				System.out.println("Multiplication : "+(num1*num2));
				//break;
			case 4:
				System.out.println("Division : "+(num1/num2));
				//break;
			default:
				System.out.println("Remainder : "+(num1%num2));
				
		}
	}

}
