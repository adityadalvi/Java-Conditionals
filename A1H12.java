import java.util.Scanner;
public class A1H12 {
/*
 Write a program to input marks of five subjects by the user. Now calculatesum and percentage of the marks.
Find the grade according to following: (Variations)
a. Percentage >= 90% : GradeA
b. Percentage >= 80% : GradeB
c. Percentage >= 70% : GradeC
d. Percentage >= 60% : GradeD
e. Percentage >= 40% : GradeE
f. Percentage < 40% : Grade F
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of sub1");
		int sub1=sc.nextInt();
		System.out.println("Enter marks of sub2");
		int sub2=sc.nextInt();
		System.out.println("Enter marks of sub3");
		int sub3=sc.nextInt();
		
		double Total_marks=sub1+sub2+sub3;
		double avg=Total_marks/3;
		System.out.println("Total_marks:"+(int) Total_marks);
		System.out.println("Average:"+avg);
		

	}

}
