import java.util.Scanner;
public class A1C2 {
//Write a program to input a number from the user and display the corresponding day ofthe week. using if else if and switch) (Variations)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		/*if(num==1)
		{
			System.out.println("Sunday");
		}
		else if(num==2)
		{
			System.out.println("Monday");
		}
		else if(num==3)
		{
			System.out.println("Tueday");
		}
		else if(num==4)
		{
			System.out.println("Wednesday");
		}
		else if(num==5)
		{
			System.out.println("Thursday");
		}
		else if(num==6)
		{
			System.out.println("Friday");
		}
		else if(num==7)
		{
			System.out.println("Saturday");
		}*/
		
		// using switch statement
		switch(num)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}






	}

}
