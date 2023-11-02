package Program;

class Student{
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee){//error because variable and parameter are same 
		                                       //to over come this error use this.rollno
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class Testthis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1=new Student(111,"sri",4000f);
      Student s2=new Student(121,"siri",5000f);
      s1.display();
      s2.display();
	}

}
