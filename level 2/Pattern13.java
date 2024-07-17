package july17;

public class Pattern13 {
	public static void main(String[] args) {
		int n=4;
		for(int i = 1 ; i <n*2; i++)
		{
			for(int j = 1 ; j< n*2 ;j++)
			{
				if( j==n || i==n || (j==1 && i<=n)|| (i==1 && j>=n)||(j==n*2-1 && i>=n)||(i==n*2-1 && j<=n))
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
       
*     * * * * 
*     *       
*     *       
* * * * * * * 
      *     * 
      *     * 
* * * *     * 


 */
