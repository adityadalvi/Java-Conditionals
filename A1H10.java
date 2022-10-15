import java.util.Scanner;
public class A1H10 {
//Write a program to display if a character is an alphabet, number or special character
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch=sc.next().charAt(0);
		if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Special Symbol");
		}

	}

}
