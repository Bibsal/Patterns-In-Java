import java.util.*;
public class hollowtriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 ||j==1 || i==n || i==j || i+j==n+1 || j==n)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("\n");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 ||i==n || i==j )
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("\n");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n  )
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
		scn.close();
	}

}
