package addition;
import java.util.Scanner;
public class constr_overload {


		int a,b,c;
		Scanner s=new Scanner(System.in);
		constr_overload()
		{
			System.out.println("Addition Of Two Numbers");
			
		}
		constr_overload(int b)
		{
			System.out.println("Enter the A value=");
			a=s.nextInt();
			this.b=b;
			c=a+b;
			
			System.out.println("The Sum of "+a+"+"+b+"="+c);
		}
		public static void main(String ar[])
		{
			constr_overload b0=new constr_overload();
			constr_overload b1=new constr_overload(6);
		
		}
		

	}


