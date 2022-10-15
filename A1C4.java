import java.util.Scanner;
public class A1C4 {
/*
 Consider a situation below of the electricity unit charges. Now input electric units by the user and calculate total
electricitybill according to the given condition. (Variations)
For first 50 units Rs. 0.50/unit For next 100 units Rs.0.75/unit For next 100 units Rs. 1.20/unit For unit above 250
Rs.1.50/unit
An additional surcharge of 20% is added to the bill
(I/P: 30 O/P:18. i/p 130 o/p: 102. i/p 230 o/p 235.2)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units:");
		int unit=sc.nextInt();
		double bill=0;
		if(unit<=50)
		{
			bill=(unit*0.5);
		}
		else if(unit>50&&unit<=150)
		{
			bill=(50*0.5)+((unit-50)*0.75);
		}
		else if(unit>150&&unit<=250)
		{
			bill=(50*0.5)+(100*0.75)+((unit-150)*1.2);
		}
		else
		{
			bill=(50*0.5)+(100*0.75)+(100*1.2)+((unit-250)*1.5);
		}
		
		double total_bill=bill+(bill*0.2);
		System.out.println(total_bill);

	}

}
