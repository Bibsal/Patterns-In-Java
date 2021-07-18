import java.util.*;
public class oomsymbol {

		public static void main(String[] args) { 
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			for(int i=1;i<=n;i++)
			{
			for(int j=1;j<=n;j++) {
				System.out.print("\t");
			
				if(i==1)
				{
					if(j==n/2 || j==n/2+1)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==2)
				{
					if(j==n/2-1 || j==n/2+2)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==3)
				{
					if(j==n/2+2)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==4)
				{
					if(j==n/2-2 || j==n/2+2)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==5)
				{
					if(j==n/2-2 ||j==n/2-1 || j==n/2+1 || j==n/2+3)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i<n)
				{
					if(j==n/2-1 || j==n/2+2 || j== n/2+4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j==n/2 || j==n/2+1)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println("\n");
			
		}
		scn.close();
						

	}

}
