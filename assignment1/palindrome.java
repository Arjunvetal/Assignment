import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int reverse=0,temp,remainder;
		temp=num;
		while(temp!=0)
		{
			remainder=temp%10;//12321,,2...3..2..1
			reverse=reverse*10+remainder;//1,,12..123..1232...12321
			temp=temp/10;//1232..123,,12..1
		
		}
		if(num==reverse)
			System.out.println("number is palindrome");
		else
			System.out.println("not a palindrome");
	
	}

}