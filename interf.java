package addition;

import java.util.Scanner;

interface addit
{
	public void add();
	void sum();
}
class add1 implements addit
{Scanner s=new Scanner(System.in);
	int a,b,c;
	public void add()
	{
		System.out.println("Enter the A and B values=");
		a=s.nextInt();
		b=s.nextInt();
		 c=a+b;
		
	}
	public void sum() {
		System.out.println("The sum of two integers for CLASS add1 is" + c);
		
	}
}
class add2 implements addit
{Scanner s=new Scanner(System.in);
	int a,b,c;
	public void add()
	{
		System.out.println("Enter the A and B values=");
		a=s.nextInt();
		b=s.nextInt();
	    c=a+b;
		
	}
	public void sum() {
		System.out.println("The sum of two integers for CLASS add1 is" +c);
		
	}
	
}
public class interf {
	public static void main(String ar[])
	{
		add1 j=new add1();
		add2 j1=new add2();
		j.add();
		j.sum();
		j1.add();
		j1.sum();
	}

}
