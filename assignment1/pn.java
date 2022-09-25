import java.util.Scanner;

class pn
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=0)
			System.out.println("given no.is positive");
			
		else
			System.out.println("Given no, is negative");
	
	}
}