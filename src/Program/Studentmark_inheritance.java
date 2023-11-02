package Program;

class base1{
	int stud_id;
	String stud_name;
	void getinfo(int id, String name) {
		stud_id=id;
		stud_name=name;
	}
	void putinfo() {
		System.out.println("stud Id:" +stud_id);
		System.out.println("stud Name:" +stud_name);
	}
}
class derived extends base1{
	int m1,m2,m3,total,average;
	void getinfo2(int mark1, int mark2 ,int mark3) {
		getinfo(22,"sri");
		m1=mark1;
		m2=mark2;
		m3=mark3;
		total=m1+m2+m3;
		average=total/3;
		}
	 void putinfo2() {
		putinfo();
		
		System.out.println("total:" +total);
		System.out.println("ave:" +average);
		
		
	
}
}
public class Studentmark_inheritance {
	public static void main(String[] arg) {
		derived d1= new derived();
		d1.getinfo2(55, 66, 56);
		d1.putinfo2();
		
	}

}

