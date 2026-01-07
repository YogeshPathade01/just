import java.util.Scanner;

public class CheckLeapYear{
	
	public static void main(String... a){

		int year;
		boolean isLeap = false;	
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
			isLeap = true;

		if(isLeap)
			System.out.println("The Given Year Is Leap Year.");
		else
			System.out.println("The Given Year Is Not Leap Year.");
	}
}