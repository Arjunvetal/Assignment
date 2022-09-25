import java.util.Scanner;
import java.lang.*;

class primeadv
{
	public static void main(String[] args)
	{
		System.out.println("Enter a no.");
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int total=0;
		 
		 for(int i=2;i<=num;i++)
		 {
			 int count=0;
			 for(int j=1;j<=i;j++)
			 {
				 if(i%j==0)
					 count++;
			 }
			 if(count==2)
			 {
				 System.out.print(" "+i);
				 total++;
				 
				
				 
			 }
			 
		 }
		  System.out.println(" ");
		   System.out.print(total);
	}
}	