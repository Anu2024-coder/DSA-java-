public class ReverseStringExample2 {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder sb = new StringBuilder(str);
        
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }
}
