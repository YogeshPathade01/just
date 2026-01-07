import java.util.Scanner;

public class SwapTwoNo{
	
	public static void main(String[] ars){
		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First No. : ");
		a=sc.nextInt();

		System.out.print("Enter Second No. : ");
		b=sc.nextInt();

		// 1)
		/*int temp = a;
		a=b;
		b=temp;

		// 2)
		a=a^b;
		b=a^b;
		a=a^b;

		// 3)
		a = a+b;
		b = a-b;
		a = a-b;

		// 4)
		a = a + b - (b = a);*/

		//5) not if a or b = 0
		a = a*b;
		b = a/b;
		a = a/b;

		System.out.println("After Swapping No. : "+ a + "  " + b);
	}
}
		