package stringManipulation;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello, world!";
        String str3 = "hello";
        String str4 = "world!";

        // Concatenation
        String str5 = str1.concat(" " + str3);
        System.out.println("Concatenation: " + str5);//Hello World hello
        

        // Length
        int length = str5.length();
        System.out.println("Length: " + length);
        
        // CharAt
        char ch = str5.charAt(0);
        System.out.println("CharAt: " + ch);

        // Substring
        String subStr = str5.substring(7, 13);
        System.out.println("Substring: " + subStr);

        // IndexOf
        int index = str5.indexOf(str4);
        System.out.println("IndexOf: " + index);

        // Equals
        boolean isEqual = str2.equals(str1);
        System.out.println("Equals: " + isEqual);

        // CompareTo
        int compare = str3.compareTo(str4);
        System.out.println("CompareTo: " + compare);

        // Split
        String[] words = str5.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // Replace
        String replacedStr = str5.replace("World", "Java");
        System.out.println("Replace: " + replacedStr);

        // Trim
        String trimmedStr = str2.trim();
        System.out.println("Trim: " + trimmedStr);

        // ToUpperCase
        String upperStr = str2.toUpperCase();
        System.out.println("ToUpperCase: " + upperStr);

        // ToLowerCase
        String lowerStr = str2.toLowerCase();
        System.out.println("ToLowerCase: " + lowerStr);
        
     
    }
}