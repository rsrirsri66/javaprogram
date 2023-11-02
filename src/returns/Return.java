package returns;
import java.util.*;
//how return works
public class Return {
	public int add() {
		int tamil=10;
		int eng=9;
		int total=tamil+eng;
		return total;//void method can not return a value 
		//              so int is used because int is a data type used for total
		//total -variable is not returned value(19) is returned
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return casio=new Return();
		int a=casio.add();
		System.out.print("ans: "+a);

	}

}
