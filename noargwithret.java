package addition;
import java.util.*;
public class noargwithret {
	
		int a,b,c;
		Scanner s=new Scanner(System.in);
		public int add()
		{
			System.out.println("Enter the A value=");
			a=s.nextInt();
			System.out.println("Enter the B value=");
			b=s.nextInt();
			c=a+b;
			return c;
		}
		public void main(String ar[])
		{
			noargwithret g=new noargwithret();
			int v;
			v=g.add();
			System.out.println("The sum is "+g.a+"+"+g.b+"="+v);
		}
	}




