package oops;
//calling parent class with child class 
//same method has same name as in parent class
class person{ //parent class
	public void role() {  
		//System.out.println("daughter");
		int a=10;
		System.out.println(a);
	}
}

public class Polymorpishm_overriding extends person{   //polymorpishm_overriding is child class 
	public void role() {
		super.role(); //this is used to call class person
		System.out.println("son");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorpishm_overriding a=new Polymorpishm_overriding();
		a.role();
		

	}

}
