import java.util.Scanner;
public class A1H6 {
//Write a program to display whether a character is an uppercase or lowercasealphabet. (Variations)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("UpperCase");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("LowerCase");
		}

	}

}
