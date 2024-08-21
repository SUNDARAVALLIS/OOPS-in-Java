package stringManipulation;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="John";
		String anotherName="John";
		String thirdName="Alice";
		
		//== for reference comparison
		System.out.println(name==anotherName);
		
		//.equals for content comparison
		System.out.println(name.equals(anotherName));
		//Strings are immutable
		//String objects are placed in the heap memory
		System.out.println(name==thirdName);
	}
}
    
