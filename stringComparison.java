public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "hello";
        System.out.println("s1 == s2 : " + (s1 == s2));   // true (same string pool)
        System.out.println("s1 == s3 : " + (s1 == s3));   // false (different memory)
        System.out.println("s1.equals(s3): " + s1.equals(s3));   // true (same text)
        System.out.println("s1.equals(s4): " + s1.equals(s4));   // false (case different)
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0 → equal
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // negative → s1 < s4
        System.out.println("s4.compareTo(s1): " + s4.compareTo(s1)); // positive → s4 > s1
    }
}
