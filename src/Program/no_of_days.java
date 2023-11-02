package Program;

import java.util.Scanner;

public class no_of_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,year,month,days,weeks;
     //String x="";
     Scanner s= new Scanner(System.in);
     System.out.print("no.of days=");
     a=s.nextInt();
     year=a/365;
     month=a%365;
     weeks=month/7;
     month=month%7;
     days=month;
     System.out.print("no.of years"+year+" "+"no.of weeks"+weeks+" "+"no.of day"+days);
	}

}
