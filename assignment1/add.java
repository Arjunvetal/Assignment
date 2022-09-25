import java.util.Scanner;
class add
{
	public static void main(String[] args)
	{
		System.out.println("Enter two no.");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=1;i<=y;i++)
		{
			x++;
		}
		System.out.println(x);
	}


}