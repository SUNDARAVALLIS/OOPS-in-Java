package stringManipulation;

public class StringBufferConcepts {

    public static void main(String[] args) {
        // Create a StringBuffer with initial value "test"
		/*String buffer is synchronized making it thread safe for multiple threads 
		 working on the same thing*/
		/*String builder is not synchronized.It is not thread safe.It
		 works on single threaded environments*/  
        StringBuffer sBuffer = new StringBuffer("test");

        // Appends string at the end of the existing text.
        sBuffer.append(" String Buffer");
        System.out.println(sBuffer);

        // Inserts string at the specified index position.
        sBuffer.insert(6, "beautiful ");
        System.out.println(sBuffer);

        // Reverse the characters in the StringBuffer
        sBuffer.reverse();
        System.out.println(sBuffer);

        // Deletes a sequence of characters from the invoking object.
        sBuffer.delete(0, 5);
        System.out.println(sBuffer);

        // Replace characters from the specified index position.
        sBuffer.replace(0, 5, "Hi");
        System.out.println(sBuffer);

        /* Capacity() method returns the current capacity of the internal buffer, 
         which is the amount of memory allocated for storing string data.*/
        int capacity = sBuffer.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);

        // Get the character at index 1 in the StringBuffer
        char ch = sBuffer.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // Ensure that the StringBuffer has a capacity of at least 20
        sBuffer.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity: " + sBuffer.capacity());

        // Copy characters from index 0 to 5 into a character array
        char[] array = new char[5];
        sBuffer.getChars(0, 5, array, 0);
        System.out.println("Char array: " + new String(array));

        // Find the index of the substring "luf" in the StringBuffer
        int index = sBuffer.indexOf("luf");
        System.out.println("Index of 'luf': " + index);

        // Find the last index of the substring "tset" in the StringBuffer
        index = sBuffer.lastIndexOf("tset");
        System.out.println("Last index of 'tset': " + index);

        // Get the length of the StringBuffer
        int length = sBuffer.length();
        System.out.println("Length of StringBuffer: " + length);

        // Set the character at index 0 to 'J' in the StringBuffer
        sBuffer.setCharAt(0, 'J');
        System.out.println("Modified StringBuffer: " + sBuffer);

        // Set the length of the StringBuffer to 5
        sBuffer.setLength(5);
        System.out.println("Length after setLength: " + sBuffer.length());

        // Get a substring from index 0 to 5 in the StringBuffer
        String substring = sBuffer.substring(0, 5);
        System.out.println("Substring: " + substring);

        // Convert the StringBuffer to a String
        String string = sBuffer.toString();
        System.out.println("String: " + string);

        // Split a string into an array based on the delimiter "@"
        String str = "Hello@Java@team";
        String[] arrOfStr = str.split("@");
        for (String a : arrOfStr)
            System.out.println(a);

        // Create two StringBuffers with the same content and compare them
        StringBuffer sb1 = new StringBuffer("HELLO");
        StringBuffer sb2 = new StringBuffer("hello");

        if (sb1.toString().equalsIgnoreCase(sb2.toString())) {
            System.out.println("The contents of sb1 and sb2 are equal.");
        } else {
            System.out.println("The contents of sb1 and sb2 are not equal.");
        }
    }
}
