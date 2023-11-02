package assesmemt;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter the month");
		int a=s.nextInt();
		while(a<5) {
			System.out.println("summer:"+a);
			break;
		}
		while(a>4&&a<9) {
			System.out.println("rainy:"+a);
			break;
		}
		while(a>8&&a<13) {
			System.out.println("winter:"+a);
			break;
		}
		while(a>12) {
			System.out.println("invalid num");
			break;
		}
	}
}
