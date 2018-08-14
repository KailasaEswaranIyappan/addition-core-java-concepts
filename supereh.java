package addition;
class additi
{
	additi(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum Of"+a+"and "+b+"is "+c);
	}
}
class sum1 extends add
{
	sum1(int a, int b) {
		super(a, b);
	}


}
public class supereh {
	public static void main(String ar[])
	{
		sum1 s=new sum1(8,7);
	}
}

