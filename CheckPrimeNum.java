import java.util.Scanner;

public class CheckPrimeNum{
	
	public static void main(String... arg){
		
		int num;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num: ");
		num = sc.nextInt();

		for(int i=2; i<num/2; i++){
			if(num == 0){
				isPrime = false;
			}
		}
	
		if(isPrime)
			System.out.println("The Given Number is Prime.");
		else
			System.out.println("The Given Number Is Not Prime.");
	}
}

		