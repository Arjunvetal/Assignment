import java.util.*;
class q5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage");
		int n=sc.nextInt();
		
		 n=((n>=85)?65:(n>=65 && n<=85)?66:(n>=50 && n<=60)?67:(n>=40 && n<=50)?68:69);
		 //x=(char)n;
		switch(n)
		{
			case 65:
				System.out.println("DISTINCTION !");
				break;
			case 66:
				System.out.println("FIRST CLASS !");
				break;
			case 67:
				System.out.println("SECOND CLASS!");
				break;
			case 68:
				System.out.println("THIRD !");
				break;
			case 69:
				System.out.println("FAIL!");
				break;
			default: System.out.println("INVALID CHOICE !");
				
		
		
		}
		
	
	}


}