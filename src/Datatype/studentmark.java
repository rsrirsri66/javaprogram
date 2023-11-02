package Datatype;

import java.util.Scanner;

public class studentmark {

	public static void main(String[] args) {
		int studentid;
		String studentname;
		int m1,m2,m3;
		float total,average;
		Scanner s= new Scanner(System.in);
		System.out.print("studentid");
		studentid=s.nextInt();
		System.out.print("studentname");
		studentname=s.next();
		System.out.print("mark1");
		m1=s.nextInt();
		System.out.print("mark2");
		m2=s.nextInt();
		System.out.print("mark3");
		m3=s.nextInt();
		total=m1+m2+m3;
		System.out.println("total:"+total);
		average=total/3;
		System.out.println("average:"+average);
		System.out.println("student mark list:");
		System.out.println("student id :" +studentid);
		System.out.println("student name :"+studentname );
		System.out.println("green computing: "+m1 );
		System.out.println("cloud computing: "+m2 );
		System.out.println("velu computing: "+m3 );
		System.out.println("total:"+total);
		System.out.println("average:"+average);
		if(average>50&&average<60) {
			System.out.println("poor");
		}
		else if(average>60&&average<70) {
			System.out.println("work hard");
		}
		else if(average>70&&average<80) {
			System.out.println("good");
		}
		else if(average>80&&average<90) {
			System.out.println("very good");
		}
		else {
			System.out.println("exellent");
		}
	}
}
