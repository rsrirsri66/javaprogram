package oops;
interface base1{
	public void fun1();
}
interface base2{
	public void fun2();
}
class inter implements base1,base2{

	@Override
	public void fun2() {
		System.out.println("fun 2");
		
	}

	@Override
	public void fun1() {
		System.out.println("fun 1");
		
	}
	
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter obj=new inter();
		obj.fun1();
		obj.fun2();

	}

}
