package Datatype;
import java.util.Scanner;
public class add {
	public static void main(String[] args) {
	//static program
	 //int num1=10,num2=20,result;
	 //int result; - declaring a variable
	 //num1=10;
	 //num2=20;
	// result=num1+num2;
	 //System.out.println("answer:"+result); 
		//dynamic program
	int a,b,result;
	Scanner s = new Scanner(System.in);
	System.out.print("enter the first num:");
	a=s.nextInt();
	System.out.print("enter the next num:");
	b=s.nextInt();
	result= a+b;
	System.out.println("adding two number:"+result);
	}
}
