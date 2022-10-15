import java.util.Scanner;
public class A1C3 {
/*
 Write a program to input basic salary of an employee and calculate its Gross salary according to following:
(Variations)
Basic Salary <= 10000: HRA = 20%, DA =80% Basic Salary <= 20000 : HRA = 25%, DA=90% Basic Salary >
20000 : HRA = 30%, DA =95%
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter basic salary:");
		Scanner sc=new Scanner(System.in);
		double bs=sc.nextDouble();
		double gs=0;
		if(bs<=10000)
		{
			gs=bs+(bs*0.2)+(bs*0.8);
			//System.out.println(gs);
		}
		else if(bs>10000&& bs<=20000)
		{
			gs=bs+(bs*0.25)+(bs*0.9);
			//System.out.println(gs);
		}
		else
		{
			gs=bs+(bs*0.3)+(bs*0.95);
			//System.out.println(gs);
		}
		System.out.println(gs);
		

	}

}
