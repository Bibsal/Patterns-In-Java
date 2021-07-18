import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int v=x*i;
			System.out.println(x +" * "+ i + " = " + v);
		}	
		scn.close();
	}

}
