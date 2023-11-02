package collection;

public class Generic_method {
	
	public static<E>void printArray(E[]elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]intArray= {10,20,30,40,50};
		Character[]charArray= {'A','S','D','F','G','H'};
		String[]StringArray= {"sri","shiva","sharoo"};
		System.out.println("PRINTING INTEGER ARRAY");
		printArray(intArray);
		System.out.println("print char array");
		printArray(charArray);
		System.out.println("print string array");
		printArray(StringArray);
		

	}

}
