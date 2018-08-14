package addition;
import java.io.*;  
import java.net.*; 
public class serveradd {  
	public static void main(String[] args){  
	try{  
	ServerSocket ss=new ServerSocket(6666);  
	Socket s=ss.accept();//establishes connection   
	DataInputStream dis=new DataInputStream(s.getInputStream());  
	String  str=(String)dis.readUTF();  
	String  a=(String)dis.readUTF();  
	String  b=(String)dis.readUTF();  
	System.out.println("Sum= "+(Integer.parseInt(a)+Integer.parseInt(b)));  
	ss.close();  
	}catch(Exception e){System.out.println(e);}  
	}  
	}  



