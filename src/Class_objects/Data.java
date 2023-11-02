package Class_objects;

class student {
	int studID=100;
	String studNAME="sri";
	public void display(){
		System.out.println("stud ID="+studID);
		System.out.println("stud Name="+studNAME);
		
	}
}
public class Data{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student d=new student();
      d.display();
	}
}
