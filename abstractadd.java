package addition;
import java.util.Scanner;
abstract class abstractadd {
	int a, b, s;

    abstract void input();

    abstract void add();

    abstract void result();

    Scanner sc = new Scanner(System.in);
}

class Second extends abstractadd {

    void input() {
        System.out.print("Enter Two Numbers :");
        a = sc.nextInt();
        b = sc.nextInt();

    }

    void add() {
        s = a + b;
    }

    void result() {
        System.out.print("\nThe Sum of Two Numebrs is :" + s);
    }

    public static void main(String args[]) {

        Second st = new Second();

        st.input();
        st.add();
        st.result();

    }
}


