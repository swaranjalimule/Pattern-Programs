package july13;

public class Pattern3 {
public static void main(String[] args) {
	int n=4;
	for(int i=1;i<=n*2;i++)//rows
	{
		for(int j=1;j<=n;j++)//column
		{
			if( i+j>=n+1 && i-j<=n-1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}

/*

      * 
    * * 
  * * * 
* * * * 
  * * * 
    * * 
      * 
        
 
  
*/