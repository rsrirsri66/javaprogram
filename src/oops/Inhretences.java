package oops;
//inheritance has parent class,child class and it is reuseability
class base{ //superclass
	int emp_id;
	String emp_name;
	void getinfo(int id, String name) {
		emp_id=id;
		emp_name=name;
	}
	void putinfo() {
		System.out.println("Employee Id:" +emp_id);
		System.out.println("Employee Name:" +emp_name);
	}
}
class Derived extends base{ //derived is subclass / new class
	String designation;
	int salary;
	void getinfo1(String desig,int sal) {
		//getinfo(102,"sri");
		designation=desig;
		salary=sal;
	}
	void putinfo1() {
		putinfo();
		System.out.println("Designation:" +designation);
		System.out.println("Salary:" +salary);
	}
}

public class Inhretences {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an obj of subclass
      Derived d=new Derived();
      //access feild of superclass
      d.emp_name="srisri";
      
      d.getinfo1("HR", 200000);
    d.putinfo1();
      d.emp_id=100;
      //call method of superclass using obj of subclass
      d.putinfo();
	}

}
