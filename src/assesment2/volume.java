package assesment2;

public class volume {
	double width,height,depth,result;
	public volume() {
	width=10.0;
	height=10.0;
	depth=10.0;
	result=width*height*depth;
	System.out.println("Constructor without parameter");
	System.out.println(result);
	}
	public volume(double w,double h, double d) {
		double Result=w*h*d;
		System.out.println("Constructor with parameter");
		System.out.println(Result);
		
	}
	

	public static void main(String[] args) {
		volume s= new volume();
		volume s1=new volume(8.0,11.0,9.0);
	}
}
		// TODO Auto-generated method stub

	


