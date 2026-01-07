import java.util.Scanner;

class TestMax{
	
	public static void main(String[] args){

		int a,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First No. : " );
		a=sc.nextInt();

		System.out.print("Enter Second No. : ");
		b=sc.nextInt();

		System.out.print("Enter Third No. : ");
		c=sc.nextInt();

		/*
		1) if(c>=a && c>=b)
			System.out.println("The Max No. : " + c);
		else if(b>=a && b>=c)
			System.out.println("The max No. : " + b);
		else
			System.out.println("The Max No. : " + a);*/

		// 2) if(a>b)
		//	b=a;
		//else if(c>b)
		//	b=c;
		
		// 3) b=(a>b)?a:b;
		//b=(c>b)?c:b;

		// 4)
		System.out.println(Math.max(a,Math.max(b,c)));
		
		//System.out.println(b);
	}
}