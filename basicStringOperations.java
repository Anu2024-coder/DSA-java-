public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "java programming";
        System.out.println("Original String: " + str1);
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 5: " + str1.charAt(5));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Substring (0,4): " + str1.substring(0, 4));
        System.out.println("Replace 'a' with 'x': " + str1.replace('a', 'x'));
        System.out.println("Contains 'Pro'? " + str1.contains("Pro"));
        System.out.println("Equals (case-sensitive): " + str1.equals(str2));
        System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase(str2));
        String str3 = " is fun!";
        System.out.println("Concatenated String: " + str1.concat(str3));
        System.out.println("Index of 'P': " + str1.indexOf('P'));
    }
}
