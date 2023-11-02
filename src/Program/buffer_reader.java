package Program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.InputStreamReader;

public class buffer_reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char m;
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter any alphabet");
		m=(char)bf.read();
		if(m>=97&&m<=123)
		{
			System.out.println("lower case");
		}
		else if(m>=65&&m<=96)
		{
			System.out.println("upper case");
			
		}
		else if(m>=48&&m<=57) {
			System.out.println("digit");
		}

	}

}
