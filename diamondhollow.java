import java.util.*;
public class diamondhollow {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int innerspace=-1;
		int outerspace=n/2;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=outerspace;j++)
			{
				System.out.print("\t");
			}
			
			System.out.print("*\t");
			
			for(int j=1;j<=innerspace;j++)
			{
				System.out.print("\t");
			}
			
			if(i>1 && i<n)
			{
				System.out.print("*\t");
			}
			
			
			if(i<=n/2)
			{
				outerspace--;
				innerspace+=2;
			}
			else
			{
				outerspace++;
				innerspace-=2;
			}
			
			System.out.println();
			scn.close();
			
		}
	}

}
