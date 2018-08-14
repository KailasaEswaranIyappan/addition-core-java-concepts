package addition;

public class copy_construc {
	
		int a1,b1;
		copy_construc(int a,int b){
	    a1=a;
	    b1=b;
		System.out.println("Sum="+(a+b));
	}
		copy_construc(copy_construc s){
	    
		System.out.println("Addition="+(s.a1+s.b1));
	}
	public static void main(String args[]) {
		copy_construc a1=new copy_construc(34,33);

		copy_construc a2=new copy_construc(a1);
	}
	}

