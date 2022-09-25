import java.util.Scanner;

class swap
{
	public static void main(String[] args)
	{
	  System.out.println("Enter two number");
	  Scanner sc=new Scanner(System.in);
	  int n1=sc.nextInt();//4
	  int n2=sc.nextInt();//5
	  
	  n1=n1+n2;//9
	  n2=n1-n2;//4
	  n1=n1-n2;//5
	  System.out.println("after swapping"+n1 +" "+n2);
	  
	
	}

}