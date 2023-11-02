package Variables;

public class Constructor {
	int studid;
	String studname,college;
	public Constructor() { //default constructor
		studid=10;
		studname="sri";
		college="abd college";
		System.out.println(studid);
		System.out.println(studname);
		System.out.println(college);
	}
	public Constructor(int ID, String name, String col) { //parameterized Constructor
		System.out.println(ID);
		System.out.println(name);
		System.out.println(col);
		
	}
   public static void main(String[] agrs) {
	   Constructor s= new Constructor(); //s is a object
	   
	   Constructor s1= new Constructor(123,"sridharan","JIT"); 
   }
}
