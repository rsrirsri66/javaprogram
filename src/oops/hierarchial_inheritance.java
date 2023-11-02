package oops;

class parents{
	void show() {
		System.out.println("we are parents");
	}
}
class son1 extends parents{
	void show1() {
		System.out.println("i am son");
	}
}
class daughter extends parents{
	void show2() {
		System.out.println("i am daughter");
	}
}
public class hierarchial_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son1 s=new son1();
		daughter d=new daughter();
		s.show();
		d.show();
		s.show1();
		d.show2();
		

	}

}
