import java.util.Scanner;

class prime
{
	public static void main(String[] args)
	{
		System.out.println("Enter a no.");
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		if(num==0 || num==1)
		{
			System.out.println("not prime no.");
			
		}
		else 
		{
			for( int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println("no prime");
					break;
				}
				
				
			else
			{
				System.out.println(" a prime");
				break;
			}
			}
			
		}
	}


}