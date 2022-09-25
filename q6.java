import java.util.*;
class q6
{
	
	double pi=3.14;
	static void perimeter(double r)
	{
		
		System.out.println("perimeter of circle : "+(2*3.14*r));
	}
	public static void area(double r)
	{
		double pi=3.14;
		System.out.println(pi*r*r);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double rad=sc.nextDouble();
		area(rad);
		perimeter(rad);
		
	}
}