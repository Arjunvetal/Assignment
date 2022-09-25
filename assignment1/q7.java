import java.util.*;
class q7
{
	public static void main(String[] args)
	{
		System.out.println("Enter the no. upto");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
	}
	 static void print(int n)
	{
		
		
			if(n>0)
			{
				print(n-1);
				System.out.print(n+" ");
				//print(n-1);
			
			}
		
	
	}

}