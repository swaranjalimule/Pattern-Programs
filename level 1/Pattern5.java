package july13;

public class Pattern5 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<n*2;i++)
		{
			for(int j=1;j<n*2;j++)
			{
				if((j-i<=n*2 && i<=j ))
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

//* * * * * * * 
//  * * * * * * 
//    * * * * * 
//      * * * * 
//        * * * 
//          * * 
//            * 

