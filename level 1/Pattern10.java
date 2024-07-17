package july13;

public class Pattern10 {
public static void main(String[] args) {
	int n=7;
	int m=4;
	for(int i =1;i<=n;i++)//rows
	{
		for(int j = 1;j<=m;j++)
		{
			if(j<=i && i+j<=m*2)//column
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