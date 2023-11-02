package collection;
import java.util.*;

public class Set_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A= {22,45,33,66,55,34,77};
		Integer[] B= {33,2,83,45,3,12,55};
		Set<Integer>set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer>set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		
		//union of a & b
		Set<Integer>union_data=new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("union:");
		System.out.println(union_data);
		
		//find intersection
		Set<Integer>intersection_data=new HashSet<Integer>(set1);
		intersection_data.retainAll(set2);
		System.out.print("intersection:");
		System.out.println(intersection_data);
		
		//difference
		Set<Integer>diff_data=new HashSet<Integer>(set1);
		diff_data.removeAll(set2);
		System.out.print("difference:");
		System.out.println(diff_data);
		
		

	}

}
