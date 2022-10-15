import java.util.Scanner;
public class A1H8 {
//Write a program to display and calculate profit or loss by a suitableexample.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sell value:");
		int sell=sc.nextInt();
		System.out.println("Enter buy value:");
		int buy=sc.nextInt();
		if(sell>buy)
		{
			System.out.println("profit");
		}
		else
		{
			System.out.println("loss");
		}

	}

}
