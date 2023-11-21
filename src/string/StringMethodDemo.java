package string;

public class StringMethodDemo {

    public static void main(String[] args) {
        // Phương thức length()
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Phương thức charAt()
        char firstChar = str.charAt(0);
        System.out.println("First character of the string: " + firstChar);

        // Phương thức substring()
        String substring = str.substring(7);
        System.out.println("Substring starting from index 7: " + substring);

        // Phương thức toUpperCase() và toLowerCase()
        String upperCaseStr = str.toUpperCase();
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Uppercase: " + upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);

        // Phương thức equals()
        String anotherStr = "hello, world!";
        boolean areEqual = str.equals(anotherStr);
        System.out.println("Are the strings equal? " + areEqual);

        // Phương thức equalsIgnoreCase()
        boolean areEqualIgnoreCase = str.equalsIgnoreCase(anotherStr);
        System.out.println("Are the strings equal (ignoring case)? " + areEqualIgnoreCase);

        // Phương thức indexOf()
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of the first comma: " + indexOfComma);

        // Phương thức lastIndexOf()
        int lastIndexOfO = str.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndexOfO);

        // Phương thức replace()
        String replacedStr = str.replace("World", "Universe");
        System.out.println("String after replacement: " + replacedStr);

        // Phương thức startsWith() và endsWith()
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World!': " + endsWithWorld);


        // convert to array
        char[] charArray = str.toCharArray();
        System.out.println("Char array is: ");
        for(int i = 0; i< charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }
}

