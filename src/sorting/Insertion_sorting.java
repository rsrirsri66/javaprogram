package sorting;

import java.util.Scanner;

public class Insertion_sorting {
	static void insertion_sort(int a[],int n) {
		for(int step=1;step<n;step++) {
		int	key=step;
		for(int j=step-1; j>=0;j--) {
			if(a[j]>a[key]) {
				int temp=a[j];
				a[j]=a[key];
				a[key]=temp;
				key--; 
			}
		}
		}
	}
	static void print(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("eneter the nums");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
		insertion_sort(a,n);
        System.out.println("after sorting:");
        print(a,n);
	}

}
