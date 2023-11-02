package oops;
abstract class Sum1{
	public abstract int sumoftwo(int n1,int n2);
	public abstract int sumofthree(int n1,int n2,int n3);

public void disp() {
	System.out.println("method of class sum");
}
}
class demo1 extends Sum1{
	public int sumoftwo(int num1,int num2) {
		return num1+num2;
	}
	public int sumofthree(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 obj=new demo1();  
		System.out.println(obj.sumoftwo(3,40)); 
		System.out.println(obj.sumofthree(23, 32, 23));
         obj.disp();
         
	}

} 

