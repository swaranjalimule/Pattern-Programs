package july17;

public class Pattern12 {
	public static void main(String[] args) {
		int n=5;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1 ; j< n*2 ;j++)
			{
				if( (i+j)%2==0 &&i+j>n && j-i<n )
				{  
					System.out.print("* ");
				
				}
				else if((i+j)%2!=0 && i+j>n && j-i<n )
				{
					System.out.print(". ");
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
      * . *       
    * . * . *     
  * . * . * . *   
* . * . * . * . * 


 */