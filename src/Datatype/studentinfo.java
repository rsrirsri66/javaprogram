package Datatype;

import java.util.Scanner;

public class studentinfo {

	public static void main(String[] args) {
		int rollno,age;
		long contact;
		String name;
		char gender;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter roll num:");
		rollno=s.nextInt();
		System.out.print("enter age:");
		age=s.nextInt();
		System.out.print("enter contact no:");
		contact=s.nextLong();
		System.out.print("enter the name:");
		name=s.next();
		System.out.print("gender:");
		gender=s.next().charAt(0);
		System.out.print("enter roll num:" +rollno);
		System.out.print("enter age:" +age);
		System.out.print("enter the name:" +name);
		System.out.println("enter contact:" +contact);
		System.out.println("enter gender:" +gender);
	}

}
