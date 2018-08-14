package addition;
import java.util.Scanner;
import java.io.*;  
import java.net.*;  
public class clientadd { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a =sc.nextInt();
		int b =sc.nextInt();
	try{      
	Socket s=new Socket("localhost",6666);  
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	dout.writeUTF("The 2 numbers are ");
	dout.writeUTF(Integer.toString(a));
	dout.writeUTF(Integer.toString(b));
	dout.flush();  
	dout.close();  
	s.close();  
	}catch(Exception e){System.out.println(e);}  
	}  
	}  


