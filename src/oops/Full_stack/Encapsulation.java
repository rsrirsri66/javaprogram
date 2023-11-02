package oops;
class encapsulationdemo{
	private int ssn;
	private String empname;
	private int empage;
	
	//getter and setter methods
	public int getEmpSSN() {
		return ssn;
	}
	public String getempName() {
		return empname;
	}
	public int getEmpAge() {
		return empage;
	}
	public void setEmpAge(int newVal) {
		empage=newVal;
	}
	public void setempName(String newVal) {
		empname=newVal;
	}
	public void setEmpSSN(int newVal) {
		ssn=newVal;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       encapsulationdemo obj=new encapsulationdemo();
       obj.setempName("sri");
       obj.setEmpAge(32);
       obj.setEmpSSN(123456);
       System.out.println("employee num:"+obj.getempName());
       System.out.println("employee age:"+obj.getEmpAge());
       System.out.println("employee ssn:"+obj.getEmpSSN());
	}

}
