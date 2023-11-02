package oops;

class person1{
	String name;
	int age;
	void getperinfo(String str,int ag) {
		name=str;
		age=ag;
	}
	void putperinfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends person1{
	int total;
	char grade;
	void getstudinfo(String n,int ag, int tot,char gr) {
		getperinfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putstudinfo() {
		putperinfo();
		System.out.println("Total:"+total);
		System.out.println("Grade:"+grade);
	}
}
public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		s.getstudinfo("sri",22, 96, 'A');
		s.putstudinfo();

	}

}
