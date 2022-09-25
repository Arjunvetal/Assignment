import java.util.*;
class q6
{
	public static void main(String[] args)
	{
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		//if((yr % 400 == 0)||((yr % 4 == 0) && (yr % 100 !== 0)))
		//{
			//System.out.println("year is leap"+yr);
	//	}
		if ((year % 400 == 0)
            || ((year % 4 == 0) && (year % 100 != 0))) {
           
            // Both conditions true- Print leap year
            System.out.println(year + " : Leap Year");
        }
		else
			System.out.println("year is not leap"+year);
	}
}