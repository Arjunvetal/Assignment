import java.util.Scanner;
//import java.lang;

class fact{
	
	static long fact(long num){
	if (num == 0)    
			return 1;    
	else    
			return(num * fact(num-1));    
		}
	public static void main(String[] argc)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextInt();
		long ans=fact(num);
		 System.out.println("Factorial of "+num+" is: "+ans);    
		
	
	}

}