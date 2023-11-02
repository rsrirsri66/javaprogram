package assesmemt;

import java.util.Scanner;

public class months {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter the month");
		int a=s.nextInt();
		if(a==1) {
			System.out.println("JAN");
		}
		else if(a==2) {
			System.out.println("FEB");
		}
		else if(a==3) {
			System.out.println("MARCH");
		}
		else if(a==4) {
			System.out.println("APRIL");
		}
		else if(a==5) {
			System.out.println("MAY");
			
		}
		else if(a==6) {
			System.out.println("JUN");
		}
		else if(a==7) {
			System.out.println("JULY");
		}
		else if(a==8) {
			System.out.println("AUG");
		}
		else if(a==9) {
			System.out.println("SEP");
		}
		else if(a==10) {
			System.out.println("OCT");
			
		}
		else if(a==11) {
			System.out.println("NOV");
		}
		else if(a==12) {
			System.out.println("DEC");
		}
		else if(a==1&&a==2&&a==3&&a==4) {
			System.out.println("summer");
		}
		}

}
