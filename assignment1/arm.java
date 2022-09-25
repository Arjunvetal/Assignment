import java.util.Scanner;
import java.lang.Math; 

class arm

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
		int temp=no;
		int numberofdigit=nodigit(no); 
		while(temp>0)
		{
			currentdigit=temp%10;
			sum=sum+(int)(Math.pow(currentdigit,numberofdigit));
			temp=temp/10;
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
	if(arm!=0)
		System.out.println("given no. is armstrong");
	else
		System.out.println("not armstrong");
	
	
	
	
  }
}