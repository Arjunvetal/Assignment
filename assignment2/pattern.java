class pattern
{
 public static void main(String[] args)
 {
	for(int i=8;i>=0;i--)
	{int sum=0;
		for(int j=i;j>=0;j--)
		{
			System.out.print("  "+j);
			//int sum=0;
			sum=sum+j;
		}
		System.out.print(" "+sum);
		System.out.println(" ");
	}
 
 
 }




}