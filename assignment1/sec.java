import java.util.Scanner;

class sec{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		{
		System.out.println("num is even");
		}
		else{
			System.out.println("num is odd");
		}
	}
}