import java.util.Scanner;
public class A1H7 {
//Write a program to display whether the triangle is equilateral, isosceles or scalene triangle.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side1 value:");
		int side1=sc.nextInt();
		System.out.println("Enter side2 value:");
		int side2=sc.nextInt();
		System.out.println("Enter side3 value:");
		int side3=sc.nextInt();
		if(side1==side2 && side1==side3 && side2==side3)
		{
			System.out.println("equilateral");
		}
		else if(side1==side2 || side1==side3 || side2==side3)
		{
			System.out.println("isosceles");
		}
		else
		{
			System.out.println("scalene");
		}
			

	}

}
