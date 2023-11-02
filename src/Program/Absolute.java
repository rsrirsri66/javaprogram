package Program;

public class Absolute {
	int first=4,sec=9;
	public void add() {
		System.out.println("add="+(first+sec));
	}
	public void sub() {
		System.out.println("Difference="+Math.abs(first-sec));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Absolute ab = new Absolute();
        ab.sub();
        ab.add();
	}

}
