package addition;
import java.util.Scanner;
public class thread {
void sum() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 nos");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Sum="+(a+b));
			
		}
		class get extends Thread{
			public void run() {
			  sum();
			}
		}
		
	    public static void main(String[] args)
	    {
	    	Thread t1 =new Thread();  
	    	t1.start();  
	    	
	    }
	}


