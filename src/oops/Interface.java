package oops;

interface myinterface{
	public void meth1();
	public void meth2(); 
}
class demo4 implements myinterface {
	public void meth1() {
		System.out.println("implementation of method 1");
	}
	public void meth2() {
		System.out.println("implementation of method2");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo4 obj=new demo4(); 
      obj.meth1();
	}

}
