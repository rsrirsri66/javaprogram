package controlflow;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
	 int radius;
	 double pi=3.142,area;
	 Scanner s = new Scanner(System.in);
	 System.out.print("radius=");
	 radius=s.nextInt();
	 area=pi*radius*radius;
	 System.out.println("area="+area);
	}

}
