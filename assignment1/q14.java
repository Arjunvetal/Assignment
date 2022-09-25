import java.util.*;
class q14
{
	public static void main(String[] args)
	{
		System.out.println("Enter the two number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();//12 15  3
		int gcd;
		int x=(n1>n2)?n1:n2;
		for(int i=2;i<=x;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i);
				break;
			}
		
		}
		
		
	
	
	}


}