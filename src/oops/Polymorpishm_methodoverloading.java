package oops;

class overloaded{
	void demo(int a) {//demo is called as method 
// a iS called as parameter multiple methods 
		//but different parameter
		System.out.println(a);
	}
	void demo(int a,int b) {
		System.out.println(+a+","+b);
		
	}
	double demo(double a) { //void means no return
		System.out.println("double a:"+a);
		return a*a;
	}
}
public class Polymorpishm_methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        overloaded obj=new overloaded();
        double result;
        obj.demo(10);     
        obj.demo(20, 10);
        result=obj.demo(5.5);
        System.out.print(result);
	}

}
