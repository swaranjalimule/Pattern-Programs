package july16;

public class Pattern2 {
	public static void main(String[] args) {
		int n=4;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1 ; j<n*2 ;j++)
			{
				if(i==1 || i+j==n*2 || i==j)
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
