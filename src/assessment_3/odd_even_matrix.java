package assessment_3;

import java.util.Scanner;

public class odd_even_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,flag=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("row:");
		r=s.nextInt();
		System.out.print("column:");
		c=s.nextInt();
		int ar[][]=new int[r][c];
		
		
		
		System.out.println("enter the element=");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ar[i][j]=s.nextInt();
				
			}
		}
		
		System.out.println("enter the matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++)
			{
				
				if(ar[i][j]%2==0)
				{
					flag++;
					
			}
				else {
					count++;
				}
		}
			}
		
		
			System.out.println("even:"+flag);
			System.out.println("odd:"+count);
			
}
}

