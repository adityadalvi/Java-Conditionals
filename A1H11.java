import java.util.Scanner;
public class A1H11 {
//Write a program to display if the entered year is a leap year or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		if(year%400==0||year%100!=0&&year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Lear Year");
		}
		/*if(year%4==0)
		{
			if(year%400==0)
			{
				System.out.println("Year is leap Year");
			}
			else if(year%100==0)
			{
				System.out.println("Year not a leap Year");
			}
			else
			{
				System.out.println("Year is leap Year");
			}
		}
		else 
		{
			System.out.println("Year not a leap Year");
		}*/
		

	}

}
