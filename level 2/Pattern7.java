package july16;

public class Pattern7{
	public static void main(String[] args) {
		int n=4;
		for(int i = 1 ; i < n*2; i++)
		{
			for(int j = 1 ; j< n*2 ;j++)
			{
				if( j==1 || i==1 || i+j==n*2)
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

* * * * * * * 
*         *   
*       *     
*     *       
*   *         
* *           
*             

          
  
*/
