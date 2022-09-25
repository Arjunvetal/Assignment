import java.util.*;
class q3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amout");
		double n1=sc.nextDouble();
		System.out.println("how many year");
		int yr=sc.nextInt();
		System.out.println("Enter interest");
		double r=sc.nextDouble();
		double ci=n1*(Math.pow((1+r/100),yr));
		System.out.println(ci);
		
		
	}

}