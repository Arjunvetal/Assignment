import java.util.*;
class Q8
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int temp=n%10;//123   3
			sum=sum+temp;//3
			n=n/10;//
		}
		System.out.println(sum);
	}

}