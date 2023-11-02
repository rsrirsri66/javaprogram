package Variables;


public class Local_variable { //claas name
	int a; //global variable or instance variable
	public void display() { //method name
		a=10;
		int b=20; //localvariable
		System.out.println(a);
		System.out.println(b);
	}
	public void display1()
	{
		 a=30;
		System.out.println(a); 
	}
	public static void main(String[] args) {
		Local_variable s= new Local_variable();
		s.display();
		s.display1(); 
	}
}
