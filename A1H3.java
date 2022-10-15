import java.util.Scanner;
public class A1H3 {
//Write a program to display whether a number is negative, positive or zero.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
	
		if(num>0)
		{
			System.out.println("positive");
		}
		else if(num<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
		

	}

}
