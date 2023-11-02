package Class_objects;

public class First {
    int n1=12,n2=23,n3; //state or attributes or data
    void add() {  //behaviour or function or action 
    	n3=n1+n2;
    	System.out.println(n3);
	}
    void sub() {
    	n3=n1-n2;
    	System.out.println(n3);
    }
    void multi() {
    	n2=n1*n3;
    	System.out.println(n2);
    }
    void div() {
    	n1=n2%n3;
    	System.out.println(n1);
    }
    public static void main(String[] args) {
    	First f = new First();
    	f.add();
    	f.sub();
    	f.multi();
    	f.div();
    	student d1= new student();
    	d1.display();
    }

}
