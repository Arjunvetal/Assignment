import java.util.*;
class Solution 
{
    public static void main(String[] args)
    {
		int n=4;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
           int x=17;
            for(int j=1;j<=n;j++)
            {
                System.out.print(x);
                x++;
            }
        }
        
    }
}
