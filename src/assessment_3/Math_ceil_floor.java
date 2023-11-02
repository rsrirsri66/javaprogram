package assessment_3;

import java.util.Scanner;

public class Math_ceil_floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 ;

			double d2 ;
			Scanner s=new Scanner(System.in);
			System.out.print("d1:");
			d1=s.nextDouble();
			System.out.print("d2:");
			d2=s.nextDouble();

			System.out.println("Ceiling of "+d1+"="+Math.ceil(d1)); 
			
			System.out.println("Floor of "+d1+"="+ Math.floor(d1));

			System.out.println("Ceiling of " + d2+"="+ Math.ceil(d2));

			System.out.println("Floor of " + d2+"=" + Math.floor(d2));

	}

}
