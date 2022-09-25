import java.util.*;
class q4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amout");
		double n1=sc.nextDouble();
		System.out.println("how many year");
		double yr=sc.nextInt();
		System.out.println("Enter interest");
		double r=sc.nextDouble();
		//double ci=n1*(Math.pow((1+r/100),yr));
		double ans;
		for(double i=yr;i>=1;i--)
		{
			ans=n1*r/100;
		}
		double temp=n1*ans;
		System.out.println(temp);
		
		
	}

}