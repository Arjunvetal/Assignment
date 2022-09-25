import java.util.Scanner;
import java.lang.Math; 

class new1

{
	
	static int nodigit(int num)
	{
		int nodigit=0;
		while(num>0)
		{
			num=num/10;
			nodigit++;
		} 
			return nodigit;
	}
	static int armstrong(int no)
	{	
		int sum=0,currentdigit;
		int numberofdigit=nodigit(no); 
		while(no>0)
		{
			currentdigit=no%10;
			sum=sum+(int)(Math.pow(currentdigit,numberofdigit));
			no=no/10;
		}
		if(sum==no)
			return 1;
		else
			return 0;
		
	}
	
public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int no=sc.nextInt();
	int arm=armstrong(no);
	if(arm=0)
		System.out.println("given no. is armstrong");
	else
		System.out.println("not armstrong");
	
	
	
	
  }
}