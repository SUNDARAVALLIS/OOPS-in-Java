package stringManipulation;

public class StringBuilderConcepts {
	public static void main(String[] args) {
		        StringBuilder sb = new StringBuilder();
		        sb.append("  Programming");
		        System.out.println(sb);
		        
		        sb.insert(5, "Beautiful");
		        System.out.println(sb);
		        
		        sb.delete(0, 5);
		        System.out.println(sb);
		        
		        sb.replace(0, 9, "Hello");
		        System.out.println(sb);
		        
		        sb.reverse();
		        System.out.println(sb);
		        
		        int capacity = sb.capacity();
		        System.out.println("Capacity of StringBuilder: " + capacity);
		        
		        char ch = sb.charAt(0);
		        System.out.println("Character at index 0: " + ch);
		        
		        sb.ensureCapacity(10);
		        System.out.println("Capacity after ensureCapacity: " + sb.capacity());
		        
		        char[] array = new char[5];
		        sb.getChars(0, 5, array, 0);
		        System.out.println("Char array: " + new String(array));
		        
		        int index = sb.indexOf("Programming");
		        System.out.println("Index of 'Programming': " + index);
		        
		        index = sb.lastIndexOf("Programming");
		        System.out.println("Last index of 'Programming': " + index);
		        
		        int length = sb.length();
		        System.out.println("Length of StringBuilder: " + length);
		        
		        sb.setCharAt(0, 'J');
		        System.out.println("Modified StringBuilder: " + sb);
		        
		        sb.setLength(11);
		        System.out.println("Length after setLength: " + sb.length());
		        
		        String substring = sb.substring(0, 5);
		        System.out.println("Substring: " + substring);
		        
		        String string = sb.toString();
		        System.out.println("String: " + string);
		        
		    }

	
	}

