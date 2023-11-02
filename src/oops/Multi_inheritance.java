package oops;
 class grand_father{
	 void show1() {
		 System.out.println("i am grand father");
	 }
 }
 class father extends grand_father{
	 void show2() {
		 System.out.println("im a father");
	 }
 }
 class son extends father{
	 void show3() {
		 System.out.println("im a son");
	 }
 }
 class grand_son extends son{
	 void show4() {
		 System.out.println("im a grand son");
	 }
 }

public class Multi_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grand_son gs=new grand_son();
		gs.show4();
		gs.show3();
		gs.show2();
		gs.show1();

	}

}
